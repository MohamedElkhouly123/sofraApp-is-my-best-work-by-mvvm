package com.example.sofra.data.local;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import com.example.sofra.data.model.clientMakeNewOrder.ClientMakeNewOrderItemForRoom;


@Database(entities = {ClientMakeNewOrderItemForRoom.class,}, version = 1, exportSchema = false)


//@Database(entities = {Client.class, ClientData.class}, version = 1, exportSchema = false)  // more than ClientMakeNewOrderItem
//@TypeConverters({DataTypeConverter.class})
public abstract class DataBase extends RoomDatabase {
    private static final String DB_NAME = "database.db";
    private static volatile DataBase instance;

    // region singleton implementation
    public static synchronized DataBase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static DataBase create(final Context context) {
        Builder<DataBase> builder = Room.databaseBuilder(context, DataBase.class, DB_NAME).fallbackToDestructiveMigration();
        return builder.build();
    }

    // endregion
    // region DAOs
    public abstract ClientMakeNewOrderItemForRoomDao addNewOrderItemDao();
}
