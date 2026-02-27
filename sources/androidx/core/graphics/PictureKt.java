package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i4, Function1<? super Canvas, Unit> function1) {
        try {
            function1.invoke(picture.beginRecording(i, i4));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
