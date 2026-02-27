package mx_android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
class ContextCompatHoneycomb {
    ContextCompatHoneycomb() {
    }

    static void startActivities(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    public static File getObbDir(Context context) {
        return context.getObbDir();
    }
}
