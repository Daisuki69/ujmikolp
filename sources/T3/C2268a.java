package t3;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import v3.i;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2268a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20149a;

    public C2268a(i iVar) {
        this.f20149a = (i) Preconditions.checkNotNull(iVar);
        switch (iVar.f20466a) {
            case 0:
                Point[] pointArrZzo = ((zzyb) iVar.f20467b).zzo();
                if (pointArrZzo != null) {
                    int iMax = Integer.MIN_VALUE;
                    int iMin = Integer.MAX_VALUE;
                    int iMin2 = Integer.MAX_VALUE;
                    int iMax2 = Integer.MIN_VALUE;
                    for (Point point : pointArrZzo) {
                        iMin = Math.min(iMin, point.x);
                        iMax = Math.max(iMax, point.x);
                        iMin2 = Math.min(iMin2, point.y);
                        iMax2 = Math.max(iMax2, point.y);
                    }
                    new Rect(iMin, iMin2, iMax, iMax2);
                }
                break;
            default:
                zzu zzuVar = (zzu) iVar.f20467b;
                if (zzuVar.zze != null) {
                    int i = 0;
                    int iMax3 = Integer.MIN_VALUE;
                    int iMin3 = Integer.MAX_VALUE;
                    int iMin4 = Integer.MAX_VALUE;
                    int iMax4 = Integer.MIN_VALUE;
                    while (true) {
                        Point[] pointArr = zzuVar.zze;
                        if (i >= pointArr.length) {
                            new Rect(iMin3, iMin4, iMax3, iMax4);
                        } else {
                            Point point2 = pointArr[i];
                            iMin3 = Math.min(iMin3, point2.x);
                            iMax3 = Math.max(iMax3, point2.x);
                            iMin4 = Math.min(iMin4, point2.y);
                            iMax4 = Math.max(iMax4, point2.y);
                            i++;
                        }
                    }
                }
                break;
        }
        switch (iVar.f20466a) {
            case 0:
                ((zzyb) iVar.f20467b).zzo();
                break;
            default:
                Point[] pointArr2 = ((zzu) iVar.f20467b).zze;
                break;
        }
    }
}
