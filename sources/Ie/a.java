package Ie;

import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends TransitionSet {
    public a() {
        setOrdering(0);
        addTransition(new ChangeBounds());
        addTransition(new ChangeTransform());
        addTransition(new ChangeImageTransform());
    }
}
