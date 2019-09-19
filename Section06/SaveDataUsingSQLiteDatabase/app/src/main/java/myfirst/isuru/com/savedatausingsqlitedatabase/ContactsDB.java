package myfirst.isuru.com.savedatausingsqlitedatabase;

import android.content.Context;
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

            String sqlcode ="CREATE TABLE "+DATABASE_TABLE+" ("+KEY_ID+" INTEGER PRIMARY KEY AUTO INCREMENT, "
                    +KEY_NAME+" TEXT NOT NULL, "+KEY_CELL+" TEXT NOT NULL);";
            db.execSQL(sqlcode);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE);
            onCreate(db);
        }
    }
}
