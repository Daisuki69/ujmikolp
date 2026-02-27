package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f20163b;
    public static final i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f20164d;
    public static final /* synthetic */ i[] e;

    static {
        i iVar = new i("BOTH", 0);
        f20162a = iVar;
        i iVar2 = new i("TOP", 1);
        f20163b = iVar2;
        i iVar3 = new i("BOTTOM", 2);
        c = iVar3;
        i iVar4 = new i("NONE", 3);
        f20164d = iVar4;
        e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) e.clone();
    }
}
