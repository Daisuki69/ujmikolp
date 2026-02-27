package M8;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class I implements View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return i == 66 && keyEvent.getAction() == 0;
    }
}
