package D;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.paymaya.domain.model.ShareSaveAppInfo;
import com.paymaya.domain.store.K0;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: D.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0183p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f933a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f934b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f935d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC0183p(A7.f fVar, String str, String str2, String[] strArr) {
        this.f935d = fVar;
        this.f934b = str;
        this.c = str2;
        this.e = strArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap bitmap;
        switch (this.f933a) {
            case 0:
                C c = ((C0187u) this.f935d).f949b;
                Context context = (Context) this.e;
                String str = this.f934b;
                String str2 = this.c;
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("Peri"));
                try {
                    ((C0176i) c.f817g).j(context, 2, str, false);
                    return null;
                } catch (Exception unused) {
                    S.c(str2, numX49.tnTj78("PerE") + ((CleverTapInstanceConfig) c.f814a).f9439a);
                    return null;
                }
            case 1:
                return Integer.valueOf(((Xe.d) ((A7.f) this.f935d).f210b).b(this.f934b, this.c, (String[]) this.e));
            default:
                Intent intent = new Intent();
                intent.setAction(numX49.tnTj78("PerV"));
                String str3 = this.f934b;
                if (str3 == null) {
                    str3 = AssetHelper.DEFAULT_MIME_TYPE;
                }
                intent.setType(str3);
                String str4 = this.c;
                if (str4 != null) {
                    intent.putExtra(numX49.tnTj78("PerS"), str4);
                }
                String str5 = (String) this.f935d;
                if (str5 != null) {
                    intent.putExtra(numX49.tnTj78("Perj"), Uri.parse(str5));
                }
                K0 k02 = (K0) this.e;
                List<ResolveInfo> listQueryIntentActivities = k02.f11365b.queryIntentActivities(intent, 65536);
                kotlin.jvm.internal.j.f(listQueryIntentActivities, numX49.tnTj78("Perd"));
                List<ResolveInfo> list = listQueryIntentActivities;
                ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
                for (ResolveInfo resolveInfo : list) {
                    PackageManager packageManager = k02.f11365b;
                    String string = resolveInfo.loadLabel(packageManager).toString();
                    Drawable drawableLoadIcon = resolveInfo.loadIcon(packageManager);
                    if (drawableLoadIcon instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawableLoadIcon).getBitmap();
                    } else {
                        Bitmap bitmapCreateBitmap = (drawableLoadIcon.getIntrinsicWidth() <= 0 || drawableLoadIcon.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawableLoadIcon.getIntrinsicWidth(), drawableLoadIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.j.d(bitmapCreateBitmap);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawableLoadIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawableLoadIcon.draw(canvas);
                        bitmap = bitmapCreateBitmap;
                    }
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ShareSaveAppInfo(activityInfo.packageName, activityInfo.name, string, bitmap));
                }
                return arrayList;
        }
    }

    public /* synthetic */ CallableC0183p(C0187u c0187u, Context context, String str, String str2) {
        this.f935d = c0187u;
        this.e = context;
        this.f934b = str;
        this.c = str2;
    }

    public /* synthetic */ CallableC0183p(String str, String str2, String str3, K0 k02) {
        this.f934b = str;
        this.c = str2;
        this.f935d = str3;
        this.e = k02;
    }
}
