package We;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import dOYHB6.tiZVw8.numX49;
import java.io.FileNotFoundException;
import java.util.List;
import okio.Okio;
import okio.Source;

/* JADX INFO: renamed from: We.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0606j extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6406b;

    public /* synthetic */ C0606j(Context context, int i) {
        this.f6405a = i;
        this.f6406b = context;
    }

    @Override // We.H
    public boolean b(F f) {
        switch (this.f6405a) {
            case 0:
                return numX49.tnTj78("bkR1").equals(f.f6354a.getScheme());
            default:
                if (f.f6355b != 0) {
                    return true;
                }
                return numX49.tnTj78("bkRf").equals(f.f6354a.getScheme());
        }
    }

    @Override // We.H
    public Q3.b e(F f, int i) throws FileNotFoundException {
        Resources resources;
        Context context = this.f6406b;
        switch (this.f6405a) {
            case 0:
                return new Q3.b(Okio.source(context.getContentResolver().openInputStream(f.f6354a)), 2);
            default:
                StringBuilder sb2 = O.f6375a;
                int i4 = f.f6355b;
                String strTnTj78 = numX49.tnTj78("bkRn");
                Uri uri = f.f6354a;
                if (i4 == 0 && uri != null) {
                    String authority = uri.getAuthority();
                    if (authority == null) {
                        throw new FileNotFoundException(strTnTj78 + uri);
                    }
                    try {
                        resources = context.getPackageManager().getResourcesForApplication(authority);
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new FileNotFoundException(numX49.tnTj78("bkRx") + uri);
                    }
                    break;
                } else {
                    resources = context.getResources();
                }
                int identifier = f.f6355b;
                if (identifier == 0 && uri != null) {
                    String authority2 = uri.getAuthority();
                    if (authority2 == null) {
                        throw new FileNotFoundException(strTnTj78 + uri);
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        throw new FileNotFoundException(numX49.tnTj78("bkRJ") + uri);
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused2) {
                            throw new FileNotFoundException(numX49.tnTj78("bkRs") + uri);
                        }
                    } else {
                        if (pathSegments.size() != 2) {
                            throw new FileNotFoundException(numX49.tnTj78("bkR5") + uri);
                        }
                        identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    }
                    break;
                }
                BitmapFactory.Options optionsC = H.c(f);
                if (optionsC != null && optionsC.inJustDecodeBounds) {
                    BitmapFactory.decodeResource(resources, identifier, optionsC);
                    H.a(f.f6356d, f.e, optionsC.outWidth, optionsC.outHeight, optionsC, f);
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier, optionsC);
                if (bitmapDecodeResource != null) {
                    return new Q3.b(bitmapDecodeResource, (Source) null, 2, 0);
                }
                throw new NullPointerException(numX49.tnTj78("bkRI"));
        }
    }
}
