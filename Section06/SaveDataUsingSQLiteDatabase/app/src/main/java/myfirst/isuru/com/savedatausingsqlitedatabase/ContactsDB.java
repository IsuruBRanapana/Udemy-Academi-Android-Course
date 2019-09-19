package myfirst.isuru.com.savedatausingsqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ContactsDB {
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "person_name";
    public static final String KEY_CELL = "_cell";

    private final String DATABASE_NAME = "ContactsDB";
    private final String DATABASE_TABLE = "ContactsTable";
    private final int DATABASE_VERSION = 1;

    private DBHelper ourHelper;
    private final Context ourContext;
    private SQLiteDatabase ourDatabase;

    public ContactsDB(Context context) {
        this.ourContext = context;
    }
    private class DBHelper extends SQLiteOpenHelper{

        public DBHelper(@Nullable Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            /*
            * CREATE TABLE (_id INTEGER PRIMARY KEY AUTO INCREMENT,
            * person_name TEXT NOT NULL, _cell TEXT NOT NULL);
            * */

            String sqlcode ="CREATE TABLE "+DATABASE_TABLE+" ("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                    +KEY_NAME+" TEXT NOT NULL, "+KEY_CELL+" TEXT NOT NULL);";
            db.execSQL(sqlcode);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE);
            onCreate(db);
        }
    }

    public ContactsDB open() throws SQLException{
        ourHelper =new DBHelper(ourContext);
        ourDatabase=ourHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        ourHelper.close();
    }

    public long CreateEntry(String name, String cell){
        ContentValues cv = new ContentValues();
        cv.put(KEY_NAME,name);
        cv.put(KEY_CELL,cell);
        return ourDatabase.insert(DATABASE_TABLE,null,cv);
    }

    public String getData(){
        String [] columns=new String[]{KEY_ID,KEY_NAME,KEY_CELL};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null);
        String result="";
        int iRowId=c.getColumnIndex(KEY_ID);
        int iName=c.getColumnIndex(KEY_NAME);
        int iCell=c.getColumnIndex(KEY_CELL);
        for (c.moveToFirst();!c.isAfterLast();c.moveToNext()){
            result=result+c.getString(iRowId)+" : "+c.getString(iName)+" "+c.getString(iCell)+"\n";
        }
        c.close();
        return result;
    }
}
