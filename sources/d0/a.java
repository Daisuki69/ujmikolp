package D0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.j;
import pg.s;
import pg.u;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements FlutterPlugin, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f965b;

    public final Uri a(String str, String str2) {
        String mimeTypeFromExtension;
        ContentResolver contentResolver;
        if (str2 == null) {
            str2 = String.valueOf(System.currentTimeMillis());
        }
        if (TextUtils.isEmpty(str)) {
            mimeTypeFromExtension = null;
        } else {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            j.f(lowerCase, "toLowerCase(...)");
            mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        }
        boolean z4 = false;
        if (mimeTypeFromExtension != null && z.w(mimeTypeFromExtension, 2, "video", false)) {
            z4 = true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(Environment.getExternalStoragePublicDirectory(z4 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES).getAbsolutePath());
            if (!file.exists()) {
                file.mkdir();
            }
            if (str.length() > 0) {
                str2 = ((Object) str2) + "." + str;
            }
            return Uri.fromFile(new File(file, str2));
        }
        Uri uri = z4 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("relative_path", z4 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES);
        if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
            contentValues.put("mime_type", mimeTypeFromExtension);
        }
        Context context = this.f965b;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        return contentResolver.insert(uri, contentValues);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f965b = binding.getApplicationContext();
        u uVar = new u(binding.getBinaryMessenger(), "image_gallery_saver_plus");
        this.f964a = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f965b = null;
        u uVar = this.f964a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, pg.t] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(pg.r r14, pg.t r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.a.onMethodCall(pg.r, pg.t):void");
    }
}
