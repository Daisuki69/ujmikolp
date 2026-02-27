package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes2.dex */
final class TtmlRegion {
    public final float height;
    public final String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(String str, float f, float f3, int i, int i4, float f7, float f10, int i6, float f11, int i10) {
        this.id = str;
        this.position = f;
        this.line = f3;
        this.lineType = i;
        this.lineAnchor = i4;
        this.width = f7;
        this.height = f10;
        this.textSizeType = i6;
        this.textSize = f11;
        this.verticalType = i10;
    }
}
