package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ActivityComponentInfo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitPairFilter {
    private final ActivityComponentInfo _primaryActivityName;
    private final ActivityComponentInfo _secondaryActivityName;
    private final String secondaryActivityIntentAction;

    public SplitPairFilter(ActivityComponentInfo _primaryActivityName, ActivityComponentInfo _secondaryActivityName, String str) {
        j.g(_primaryActivityName, "_primaryActivityName");
        j.g(_secondaryActivityName, "_secondaryActivityName");
        this._primaryActivityName = _primaryActivityName;
        this._secondaryActivityName = _secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        matcherUtils.validateComponentName$window_release(_primaryActivityName.getPackageName(), _primaryActivityName.getClassName());
        matcherUtils.validateComponentName$window_release(_secondaryActivityName.getPackageName(), _secondaryActivityName.getClassName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SplitPairFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type androidx.window.embedding.SplitPairFilter");
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return j.b(this._primaryActivityName, splitPairFilter._primaryActivityName) && j.b(this._secondaryActivityName, splitPairFilter._secondaryActivityName) && j.b(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return new ComponentName(this._primaryActivityName.getPackageName(), this._primaryActivityName.getClassName());
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return new ComponentName(this._secondaryActivityName.getPackageName(), this._secondaryActivityName.getClassName());
    }

    public int hashCode() {
        int iHashCode = (this._secondaryActivityName.hashCode() + (this._primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        j.g(primaryActivity, "primaryActivity");
        j.g(secondaryActivityIntent, "secondaryActivityIntent");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.isActivityMatching$window_release(primaryActivity, this._primaryActivityName) || !matcherUtils.isIntentMatching$window_release(secondaryActivityIntent, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || j.b(str, secondaryActivityIntent.getAction());
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        j.g(primaryActivity, "primaryActivity");
        j.g(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.isActivityMatching$window_release(primaryActivity, this._primaryActivityName) || !matcherUtils.isActivityMatching$window_release(secondaryActivity, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            return true;
        }
        Intent intent = secondaryActivity.getIntent();
        return j.b(str, intent != null ? intent.getAction() : null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitPairFilter{primaryActivityName=");
        sb2.append(getPrimaryActivityName());
        sb2.append(", secondaryActivityName=");
        sb2.append(getSecondaryActivityName());
        sb2.append(", secondaryActivityAction=");
        return androidx.camera.core.impl.a.n(sb2, this.secondaryActivityIntentAction, '}');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        this(new ActivityComponentInfo(primaryActivityName), new ActivityComponentInfo(secondaryActivityName), str);
        j.g(primaryActivityName, "primaryActivityName");
        j.g(secondaryActivityName, "secondaryActivityName");
    }
}
