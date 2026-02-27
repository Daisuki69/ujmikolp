package androidx.camera.core.impl.utils;

/* JADX INFO: loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i, int i4) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i4;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i) {
        int i4;
        int i6 = this.primaryFormat;
        if (i6 == 7 || i == 7 || i6 == i || (i4 = this.secondaryFormat) == i) {
            return true;
        }
        if ((i6 == 4 || i4 == 4) && i == 3) {
            return true;
        }
        if ((i6 == 9 || i4 == 9) && i == 8) {
            return true;
        }
        return (i6 == 12 || i4 == 12) && i == 11;
    }

    public ExifTag(String str, int i, int i4, int i6) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i4;
        this.secondaryFormat = i6;
    }
}
