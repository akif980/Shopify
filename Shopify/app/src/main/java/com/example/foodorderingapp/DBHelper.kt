package com.example.foodorderingapp
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.google.firebase.firestore.auth.User

val DATABASENAME = "MY DATABASE"
val TABLENAME = "Users"
val COL_USERNAME = "username"
val COL_password = "password"
class DBHelper(var context: Context):SQLiteOpenHelper(context, DATABASENAME, null,1){

    override fun onCreate(db: SQLiteDatabase?){

        val createTable = "CREATE TABLE " + TABLENAME + " ( " + COL_USERNAME + " VARCHAR(256) PRIMARY KEY ," +
                COL_password + " VARCHAR(256) )"
        /*val createTable = "CREATE TABLE " + TABLENAME + " ( " + COL_USERNAME + " VARCHAR(256) PRIMARY KEY ," +
                COL_password + " VARCHAR(256) )"*/
        db?.execSQL(createTable)
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    fun insertData(user: Users ) : Int {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_USERNAME, user.user)
        contentValues.put(COL_password, user.pass)
        if(checkusername(user.user)==1)
        {
            val result = database.insert(TABLENAME, null, contentValues)
            if (result == (0).toLong()) {
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
                return 0
            }
            else {
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
                return 1
            }
        }
        else
        {
            //Toast.makeText(context, "Username already taken", Toast.LENGTH_SHORT).show()
            return 0
        }
    }
    fun checkusername(x: String): Int
    {
        val db = this.readableDatabase
        val checkusername = "SELECT * FROM $TABLENAME WHERE $COL_USERNAME = '$x'"   //'" + x + "'
        val result = db.rawQuery(checkusername, null)
        //return count
        if (result.moveToFirst())
        {
            return 0
        }
        return 1
    }
    fun checkuserentry(x: String,y: String): Int
    {
        val db = this.readableDatabase
        val checkusername = "SELECT * FROM $TABLENAME WHERE $COL_USERNAME = '$x' AND $COL_password = '$y'"   //'" + x + "'
        val result = db.rawQuery(checkusername, null)
        //return count
        if (result.moveToFirst())
        {
            return 1
        }
        return 0
    }
    /*fun readData(): MutableList<User> {
        val list: MutableList<User> = ArrayList()
        val db = this.readableDatabase
        val query = "Select * from $TABLENAME"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            do {
                val user = Users()
                user.user = result.getString(result.getColumnIndex(COL_USERNAME))
                user.pass= result.getString(result.getColumnIndex(COL_password))
                //user.age = result.getString(result.getColumnIndex(COL_AGE)).toInt()

                list.add(user)
            }
            while (result.moveToNext())
        }
        return list
    }*/

}