package uz.artikov.servicepractice

import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.security.Provider.Service

class MediaService : android.app.Service() {

    private val TAG = "MediaService"

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d(TAG, "onStartCommand: ")

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(p0: Intent?): IBinder? {

        Log.d(TAG, "onBind: ")
        return null

    }

    override fun onUnbind(intent: Intent?): Boolean {

        Log.d(TAG, "onUnbind: ")

        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {

        Log.d(TAG, "onRebind: ")

        super.onRebind(intent)
    }

    override fun onCreate() {

        Log.d(TAG, "onCreate: ")

        super.onCreate()
    }


    override fun onDestroy() {

        Log.d(TAG, "onDestroy: ")

        super.onDestroy()
    }

}