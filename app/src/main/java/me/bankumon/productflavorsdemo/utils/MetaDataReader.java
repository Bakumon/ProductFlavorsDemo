package me.bankumon.productflavorsdemo.utils;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import me.bankumon.productflavorsdemo.App;

/**
 * 读取 manifests 中的 meta-data 节点
 * Created by Bakumon on 2017/9/22.
 */

public class MetaDataReader {
    private static final String TAG = MetaDataReader.class.getSimpleName();

    /**
     * 读取application 节点  meta-data 信息
     */
    public static String readAppKeyFromMetaData(String key) {
        String value = "";
        try {
            ApplicationInfo appInfo = App.getInstance().getPackageManager()
                    .getApplicationInfo(App.getInstance().getPackageName(),
                            PackageManager.GET_META_DATA);
            value = appInfo.metaData.getString(key);

            Log.e(TAG, "readAppKeyFromMetaData: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
