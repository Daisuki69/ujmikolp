package Z;

import androidx.room.FtsOptions;

/* JADX INFO: loaded from: classes2.dex */
public enum t {
    SimpleMessage(FtsOptions.TOKENIZER_SIMPLE),
    IconMessage("message-icon"),
    CarouselMessage("carousel"),
    CarouselImageMessage("carousel-image");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6857a;

    t(String str) {
        this.f6857a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6857a;
    }
}
