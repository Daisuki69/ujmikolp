package androidx.window.embedding;

import We.s;
import cj.S;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public static final class Builder {
        private boolean alwaysExpand;
        private final Set<ActivityFilter> filters;
        private String tag;

        public Builder(Set<ActivityFilter> filters) {
            j.g(filters, "filters");
            this.filters = filters;
        }

        public final ActivityRule build() {
            return new ActivityRule(this.tag, this.filters, this.alwaysExpand);
        }

        public final Builder setAlwaysExpand(boolean z4) {
            this.alwaysExpand = z4;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ ActivityRule(String str, Set set, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, (i & 4) != 0 ? false : z4);
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule) || !super.equals(obj)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return j.b(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return ((this.filters.hashCode() + (super.hashCode() * 31)) * 31) + (this.alwaysExpand ? 1231 : 1237);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        j.g(filter, "filter");
        return new ActivityRule(getTag(), S.e(this.filters, filter), this.alwaysExpand);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityRule:{tag={");
        sb2.append(getTag());
        sb2.append("},filters={");
        sb2.append(this.filters);
        sb2.append("}, alwaysExpand={");
        return s.s(sb2, this.alwaysExpand, "}}");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRule(String str, Set<ActivityFilter> filters, boolean z4) {
        super(str);
        j.g(filters, "filters");
        this.filters = filters;
        this.alwaysExpand = z4;
    }
}
