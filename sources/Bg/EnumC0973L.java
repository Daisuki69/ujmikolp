package bg;

import android.os.Build;
import java.util.LinkedHashMap;
import n3.C1916a;

/* JADX INFO: renamed from: bg.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC0973L {
    /* JADX INFO: Fake field, exist only in values array */
    BOARD(Build.BOARD),
    /* JADX INFO: Fake field, exist only in values array */
    BOOTLOADER(Build.BOOTLOADER),
    BRAND(Build.BRAND),
    /* JADX INFO: Fake field, exist only in values array */
    CPU_ABI(Build.CPU_ABI),
    DEVICE(Build.DEVICE),
    /* JADX INFO: Fake field, exist only in values array */
    FINGERPRINT(Build.FINGERPRINT),
    /* JADX INFO: Fake field, exist only in values array */
    HARDWARE(Build.HARDWARE),
    HOST(Build.HOST),
    /* JADX INFO: Fake field, exist only in values array */
    MANUFACTURER(Build.MANUFACTURER),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL(Build.MODEL),
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCT(Build.PRODUCT),
    /* JADX INFO: Fake field, exist only in values array */
    SERIAL(Build.SERIAL),
    /* JADX INFO: Fake field, exist only in values array */
    TAGS(Build.TAGS),
    RADIO_VERSION(Build.getRadioVersion());


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f8820g;
    public static final C1916a h = new C1916a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8821a;

    static {
        EnumC0973L[] enumC0973LArrValues = values();
        int iB = cj.L.b(enumC0973LArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (EnumC0973L enumC0973L : enumC0973LArrValues) {
            linkedHashMap.put(enumC0973L.name(), enumC0973L.f8821a);
        }
        f8820g = linkedHashMap;
    }

    EnumC0973L(String str) {
        this.f8821a = str;
    }
}
