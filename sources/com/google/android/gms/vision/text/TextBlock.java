package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import androidx.media3.common.C;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TextBlock implements Text {
    private zzah[] zza;
    private Point[] zzb;
    private List<Line> zzc;
    private String zzd;
    private Rect zze;

    public TextBlock(SparseArray<zzah> sparseArray) {
        this.zza = new zzah[sparseArray.size()];
        int i = 0;
        while (true) {
            zzah[] zzahVarArr = this.zza;
            if (i >= zzahVarArr.length) {
                return;
            }
            zzahVarArr[i] = sparseArray.valueAt(i);
            i++;
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Rect getBoundingBox() {
        if (this.zze == null) {
            this.zze = zzc.zza(this);
        }
        return this.zze;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public List<? extends Text> getComponents() {
        if (this.zza.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzc == null) {
            this.zzc = new ArrayList(this.zza.length);
            for (zzah zzahVar : this.zza) {
                this.zzc.add(new Line(zzahVar));
            }
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public Point[] getCornerPoints() {
        zzah[] zzahVarArr;
        int i = 4;
        int i4 = 0;
        if (this.zzb == null) {
            if (this.zza.length == 0) {
                this.zzb = new Point[0];
            } else {
                int iMax = Integer.MIN_VALUE;
                int i6 = 0;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                while (true) {
                    zzahVarArr = this.zza;
                    if (i6 >= zzahVarArr.length) {
                        break;
                    }
                    zzab zzabVar = zzahVarArr[i6].zzb;
                    zzab zzabVar2 = zzahVarArr[i4].zzb;
                    int i10 = -zzabVar2.zza;
                    int i11 = -zzabVar2.zzb;
                    double dSin = Math.sin(Math.toRadians(zzabVar2.zze));
                    int i12 = i4;
                    double dCos = Math.cos(Math.toRadians(zzabVar2.zze));
                    Point[] pointArr = new Point[i];
                    Point point = new Point(zzabVar.zza, zzabVar.zzb);
                    pointArr[i12] = point;
                    point.offset(i10, i11);
                    Point point2 = pointArr[i12];
                    int i13 = point2.x;
                    int i14 = point2.y;
                    int i15 = (int) ((((double) i14) * dSin) + (((double) i13) * dCos));
                    int i16 = (int) ((((double) i14) * dCos) + (((double) (-i13)) * dSin));
                    point2.x = i15;
                    point2.y = i16;
                    pointArr[1] = new Point(zzabVar.zzc + i15, i16);
                    pointArr[2] = new Point(zzabVar.zzc + i15, zzabVar.zzd + i16);
                    pointArr[3] = new Point(i15, i16 + zzabVar.zzd);
                    for (int i17 = i12; i17 < 4; i17++) {
                        Point point3 = pointArr[i17];
                        iMin = Math.min(iMin, point3.x);
                        iMax = Math.max(iMax, point3.x);
                        iMin2 = Math.min(iMin2, point3.y);
                        iMax2 = Math.max(iMax2, point3.y);
                    }
                    i6++;
                    i4 = i12;
                    i = 4;
                }
                int i18 = i4;
                zzab zzabVar3 = zzahVarArr[i18].zzb;
                int i19 = zzabVar3.zza;
                int i20 = zzabVar3.zzb;
                double dSin2 = Math.sin(Math.toRadians(zzabVar3.zze));
                double dCos2 = Math.cos(Math.toRadians(zzabVar3.zze));
                Point point4 = new Point(iMin, iMin2);
                Point point5 = new Point(iMax, iMin2);
                Point point6 = new Point(iMax, iMax2);
                Point point7 = new Point(iMin, iMax2);
                Point[] pointArr2 = new Point[4];
                pointArr2[i18] = point4;
                pointArr2[1] = point5;
                pointArr2[2] = point6;
                pointArr2[3] = point7;
                int i21 = i18;
                for (int i22 = 4; i21 < i22; i22 = 4) {
                    Point point8 = pointArr2[i21];
                    int i23 = point8.x;
                    int i24 = point8.y;
                    point8.x = (int) ((((double) i23) * dCos2) - (((double) i24) * dSin2));
                    point8.y = (int) ((((double) i24) * dCos2) + (((double) i23) * dSin2));
                    point8.offset(i19, i20);
                    i21++;
                    pointArr2 = pointArr2;
                }
                this.zzb = pointArr2;
            }
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getLanguage() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        HashMap map = new HashMap();
        for (zzah zzahVar : this.zza) {
            map.put(zzahVar.zzd, Integer.valueOf((map.containsKey(zzahVar.zzd) ? ((Integer) map.get(zzahVar.zzd)).intValue() : 0) + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(map.entrySet(), new zza(this))).getKey();
        this.zzd = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzd = C.LANGUAGE_UNDETERMINED;
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.vision.text.Text
    @RecentlyNonNull
    public String getValue() {
        zzah[] zzahVarArr = this.zza;
        if (zzahVarArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zzahVarArr[0].zzc);
        for (int i = 1; i < this.zza.length; i++) {
            sb2.append(Global.NEWLINE);
            sb2.append(this.zza[i].zzc);
        }
        return sb2.toString();
    }
}
