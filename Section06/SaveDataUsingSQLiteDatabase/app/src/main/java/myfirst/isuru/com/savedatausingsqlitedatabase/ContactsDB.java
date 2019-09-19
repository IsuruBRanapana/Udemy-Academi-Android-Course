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

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
