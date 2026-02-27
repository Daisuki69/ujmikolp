package E0;

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
    public u f1219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f1220b;

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
        Context context = this.f1220b;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        return contentResolver.insert(uri, contentValues);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f1220b = binding.getApplicationContext();
        u uVar = new u(binding.getBinaryMessenger(), "image_gallery_saver");
        this.f1219a = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f1220b = null;
        u uVar = this.f1219a;
        if (uVar != null) {
            uVar.b(null);
        } else {
            j.n("methodChannel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00a1: MOVE (r10 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:162), block:B:25:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, pg.t] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(pg.r r17, pg.t r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.onMethodCall(pg.r, pg.t):void");
    }
}
