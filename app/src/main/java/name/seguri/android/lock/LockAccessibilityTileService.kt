package name.seguri.android.lock

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import android.service.quicksettings.TileService
import name.seguri.android.lock.MainActivity

@TargetApi(Build.VERSION_CODES.P)
class LockAccessibilityTileService : TileService() {

    override fun onClick() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivityAndCollapse(intent)
    }
}
