package androidx.window.embedding;

import androidx.annotation.FloatRange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingAspectRatio {
    private final String description;
    private final float value;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio ALWAYS_ALLOW = new EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);
    public static final EmbeddingAspectRatio ALWAYS_DISALLOW = new EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmbeddingAspectRatio buildAspectRatioFromValue$window_release(float f) {
            EmbeddingAspectRatio embeddingAspectRatio = EmbeddingAspectRatio.ALWAYS_ALLOW;
            if (f == embeddingAspectRatio.getValue$window_release()) {
                return embeddingAspectRatio;
            }
            EmbeddingAspectRatio embeddingAspectRatio2 = EmbeddingAspectRatio.ALWAYS_DISALLOW;
            return f == embeddingAspectRatio2.getValue$window_release() ? embeddingAspectRatio2 : ratio(f);
        }

        public final EmbeddingAspectRatio ratio(@FloatRange(from = 1.0d, fromInclusive = false) float f) {
            if (f <= 1.0f) {
                throw new IllegalArgumentException("Ratio must be greater than 1.");
            }
            return new EmbeddingAspectRatio("ratio:" + f, f, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmbeddingAspectRatio(String str, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f);
    }

    public static final EmbeddingAspectRatio ratio(@FloatRange(from = 1.0d, fromInclusive = false) float f) {
        return Companion.ratio(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddingAspectRatio)) {
            return false;
        }
        EmbeddingAspectRatio embeddingAspectRatio = (EmbeddingAspectRatio) obj;
        return this.value == embeddingAspectRatio.value && j.b(this.description, embeddingAspectRatio.description);
    }

    public final String getDescription$window_release() {
        return this.description;
    }

    public final float getValue$window_release() {
        return this.value;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.value) * 31) + this.description.hashCode();
    }

    public String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("EmbeddingAspectRatio("), this.description, ')');
    }

    private EmbeddingAspectRatio(String str, float f) {
        this.description = str;
        this.value = f;
    }
}
