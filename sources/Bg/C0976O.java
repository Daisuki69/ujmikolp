package bg;

import M8.C0376l;
import android.content.Context;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1132s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: bg.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0976O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f8842d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1033d f8843a = C1034e.b(new C0376l(this, 17));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8844b;
    public final C0965G0 c;

    static {
        C0968I c0968i = new C0968I("Android SDK Emulator", 1.5f);
        c0968i.f8813d.add(new C0967H0(C1132s.g("goldfish", "generic", "SDK", "emulator", "emu", "gphone", "API"), 0));
        C0968I c0968i2 = new C0968I("Bluestacks", 2.0f);
        c0968i2.f8813d.add(new C0967H0(C1132s.g("/sdcard/windows/BstSharedFolder", "/mnt/windows/BstSharedFolder"), 1));
        C0968I c0968i3 = new C0968I("LD Player", 3.0f);
        C0969I0 c0969i0 = new C0969I0(EnumC0973L.HOST, "ubuntu");
        ArrayList arrayList = c0968i3.f8813d;
        arrayList.add(c0969i0);
        arrayList.add(new C0969I0(EnumC0973L.BRAND, "aosp"));
        arrayList.add(new C0969I0(EnumC0973L.DEVICE, "unknown"));
        arrayList.add(new C0967H0(C1132s.g("/storage/emulated/0/Android/data/com.android.ld.appstore", "/storage/emulated/0/Android/data/com.cyanogenmod.filemanager"), 1));
        arrayList.add(new C0967H0(C1132s.g("com.android.ld.appstore", "com.cyanogenmod.filemanager.ics"), 2));
        C0968I c0968i4 = new C0968I("Genymotion", 2.0f);
        C0967H0 c0967h0 = new C0967H0(C1132s.g("/dev/socket/genyd", "/dev/socket/baseband_genyd"), 1);
        ArrayList arrayList2 = c0968i4.f8813d;
        arrayList2.add(c0967h0);
        arrayList2.add(new C0967H0(cj.r.c("com.genymotion.superuser"), 2));
        C0968I c0968i5 = new C0968I("KoPlayer", 2.0f);
        c0968i5.f8813d.add(new C0967H0(C1132s.g("/storage/emulated/legacy/koplayer", "/mnt/shared/TianTian", "/mnt/shell/emulated/0/koplayer"), 1));
        C0968I c0968i6 = new C0968I("MEmuPlay", 3.0f);
        C0967H0 c0967h02 = new C0967H0(C1132s.g("com.microvirt.memuime", "com.microvirt.launcher2", "com.microvirt.installer", "com.microvirt.guide"), 2);
        ArrayList arrayList3 = c0968i6.f8813d;
        arrayList3.add(c0967h02);
        arrayList3.add(new C0967H0(C1132s.g("/storage/emulated/0/Android/data/com.microvirt.guide", "/storage/emulated/0/Android/data/com.microvirt.launcher"), 1));
        C0968I c0968i7 = new C0968I("Andy", 2.0f);
        c0968i7.f8813d.add(new C0967H0(C1132s.g("fstab.andy", "ueventd.andy.rc"), 1));
        C0968I c0968i8 = new C0968I("droid4x", 0.75f);
        c0968i8.f8813d.add(new C0967H0(cj.r.c("droid4x"), 0));
        C0968I c0968i9 = new C0968I("VirtualBox", 0.75f);
        c0968i9.f8813d.add(new C0967H0(cj.r.c("vbox"), 0));
        C0968I c0968i10 = new C0968I("Nox", 1.5f);
        C0967H0 c0967h03 = new C0967H0(cj.r.c("nox"), 0);
        ArrayList arrayList4 = c0968i10.f8813d;
        arrayList4.add(c0967h03);
        arrayList4.add(new C0967H0(EnumC0973L.RADIO_VERSION));
        arrayList4.add(new C0967H0(cj.r.c("com.amaze.filemanager"), 2));
        f8842d = C1132s.g(c0968i, c0968i2, c0968i3, c0968i4, c0968i5, c0968i6, c0968i7, c0968i8, c0968i9, c0968i10);
    }

    public C0976O(Context context, C0965G0 c0965g0) {
        this.f8844b = context;
        this.c = c0965g0;
    }
}
