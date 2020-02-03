package edu.com.deepdive.nasaapod.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import edu.com.deepdive.nasaapod.model.entity.Apod;

@Database(
    entities = {Apod.class},
    version = 1,
    exportSchema = true
)
public abstract class ApodDatabase extends RoomDatabase {

  private static final String DB_NAME = "apod_db";

  private static Application context;

  public static void setContext(Application context) {
    ApodDatabase.context = context;
  }


}
