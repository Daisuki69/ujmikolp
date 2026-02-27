package K8;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }
}
