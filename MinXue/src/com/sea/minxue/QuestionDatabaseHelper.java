package com.sea.minxue;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDatabaseHelper extends SQLiteOpenHelper {

	public static final int DATABASE_VERSION = 2;
	public static final String DATABASE_NAME = "questionlibrary.db";
	private static final String SQL_CREATE_STRING="CREATE TABLE question ("+
	"_id INTEGER PRIMARY KEY,questions varchar(100),a varchar(50),b varchar(50),c varchar(50)"+","
			+"d varchar(50),answer varchar(50));";
	private static final String SQL_DELETE_STRING =
		    "DROP TABLE IF EXISTS question";
	public QuestionDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(SQL_CREATE_STRING);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL(SQL_DELETE_STRING);
		onCreate(db);
	}

	@Override
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		onUpgrade(db, oldVersion, newVersion);
	}
	
	
}
