package p3;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f19032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f19033b;

    static {
        i iVar = new i("UNKNOWN", 0);
        f19032a = iVar;
        f19033b = new i[]{iVar, new i("BASE", 1), new i("TRANSLATE", 2), new i("ENTITY_EXTRACTION", 3), new i("CUSTOM", 4), new i("DIGITAL_INK", 5), new i("DIGITAL_INK_SEGMENTATION", 6), new i("TOXICITY_DETECTION", 7), new i("IMAGE_CAPTIONING", 8)};
    }

    @NonNull
    public static i[] values() {
        return (i[]) f19033b.clone();
    }
}
