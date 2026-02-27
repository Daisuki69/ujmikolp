package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzab;

/* JADX INFO: loaded from: classes3.dex */
final class zzc {
    public static Rect zza(Text text) {
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : text.getCornerPoints()) {
            iMin = Math.min(iMin, point.x);
            iMax2 = Math.max(iMax2, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.y);
        }
        return new Rect(iMin, iMin2, iMax2, iMax);
    }

    public static Point[] zza(zzab zzabVar) {
        double dSin = Math.sin(Math.toRadians(zzabVar.zze));
        double dCos = Math.cos(Math.toRadians(zzabVar.zze));
        double d10 = zzabVar.zza;
        int i = zzabVar.zzc;
        Point[] pointArr = {new Point(zzabVar.zza, zzabVar.zzb), new Point((int) ((((double) i) * dCos) + d10), (int) ((((double) i) * dSin) + ((double) zzabVar.zzb))), new Point((int) (d - (((double) i) * dSin)), (int) (d + ((double) point.y))), new Point(i, (point.y - point.y) + i)};
        Point point = pointArr[1];
        double d11 = point.x;
        int i4 = zzabVar.zzd;
        double d12 = ((double) i4) * dCos;
        Point point2 = pointArr[0];
        int i6 = point2.x;
        Point point3 = pointArr[2];
        int i10 = point3.x;
        Point point4 = pointArr[1];
        int i11 = (i10 - point4.x) + i6;
        int i12 = point2.y;
        return pointArr;
    }
}
