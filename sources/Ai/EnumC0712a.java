package ai;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import dOYHB6.tiZVw8.numX49;
import g3.InterfaceC1498b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ai.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0712a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("0")
    public static final EnumC0712a f7235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)
    public static final EnumC0712a f7236b;

    @InterfaceC1498b(ExifInterface.GPS_MEASUREMENT_2D)
    public static final EnumC0712a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0712a[] f7237d;

    static {
        EnumC0712a enumC0712a = new EnumC0712a(numX49.tnTj78("buCr"), 0);
        f7235a = enumC0712a;
        EnumC0712a enumC0712a2 = new EnumC0712a(numX49.tnTj78("buCZ"), 1);
        f7236b = enumC0712a2;
        EnumC0712a enumC0712a3 = new EnumC0712a(numX49.tnTj78("buCk"), 2);
        c = enumC0712a3;
        f7237d = new EnumC0712a[]{enumC0712a, enumC0712a2, enumC0712a3};
    }

    public static EnumC0712a valueOf(String str) {
        return (EnumC0712a) Enum.valueOf(EnumC0712a.class, str);
    }

    public static EnumC0712a[] values() {
        return (EnumC0712a[]) f7237d.clone();
    }
}
