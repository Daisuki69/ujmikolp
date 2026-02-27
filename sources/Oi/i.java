package Oi;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import g3.InterfaceC1498b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("0")
    public static final i f4849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)
    public static final i f4850b;

    @InterfaceC1498b(ExifInterface.GPS_MEASUREMENT_2D)
    public static final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f4851d;

    static {
        i iVar = new i("OPTIMIZED", 0);
        f4849a = iVar;
        i iVar2 = new i("DEBUG", 1);
        f4850b = iVar2;
        i iVar3 = new i("NONE", 2);
        c = iVar3;
        f4851d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f4851d.clone();
    }
}
