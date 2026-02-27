package butterknife;

import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes2.dex */
public interface Unbinder {
    public static final Unbinder EMPTY = new a();

    @UiThread
    void unbind();
}
