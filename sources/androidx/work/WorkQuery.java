package androidx.work;

import android.annotation.SuppressLint;
import androidx.work.WorkInfo;
import cj.C1112C;
import cj.C1129o;
import cj.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkQuery {
    public static final Companion Companion = new Companion(null);
    private final List<UUID> ids;
    private final List<WorkInfo.State> states;
    private final List<String> tags;
    private final List<String> uniqueWorkNames;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private final List<UUID> ids;
        private final List<WorkInfo.State> states;
        private final List<String> tags;
        private final List<String> uniqueWorkNames;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromIds(List<UUID> ids) {
                j.g(ids, "ids");
                Builder builder = new Builder(null);
                builder.addIds(ids);
                return builder;
            }

            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromStates(List<? extends WorkInfo.State> states) {
                j.g(states, "states");
                Builder builder = new Builder(null);
                builder.addStates(states);
                return builder;
            }

            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromTags(List<String> tags) {
                j.g(tags, "tags");
                Builder builder = new Builder(null);
                builder.addTags(tags);
                return builder;
            }

            @SuppressLint({"BuilderSetStyle"})
            public final Builder fromUniqueWorkNames(List<String> uniqueWorkNames) {
                j.g(uniqueWorkNames, "uniqueWorkNames");
                Builder builder = new Builder(null);
                builder.addUniqueWorkNames(uniqueWorkNames);
                return builder;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromIds(List<UUID> list) {
            return Companion.fromIds(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromStates(List<? extends WorkInfo.State> list) {
            return Companion.fromStates(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromTags(List<String> list) {
            return Companion.fromTags(list);
        }

        @SuppressLint({"BuilderSetStyle"})
        public static final Builder fromUniqueWorkNames(List<String> list) {
            return Companion.fromUniqueWorkNames(list);
        }

        public final Builder addIds(List<UUID> ids) {
            j.g(ids, "ids");
            x.p(ids, this.ids);
            return this;
        }

        public final Builder addStates(List<? extends WorkInfo.State> states) {
            j.g(states, "states");
            x.p(states, this.states);
            return this;
        }

        public final Builder addTags(List<String> tags) {
            j.g(tags, "tags");
            x.p(tags, this.tags);
            return this;
        }

        public final Builder addUniqueWorkNames(List<String> uniqueWorkNames) {
            j.g(uniqueWorkNames, "uniqueWorkNames");
            x.p(uniqueWorkNames, this.uniqueWorkNames);
            return this;
        }

        public final WorkQuery build() {
            if (this.ids.isEmpty() && this.uniqueWorkNames.isEmpty() && this.tags.isEmpty() && this.states.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
        }

        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WorkQuery fromIds(List<UUID> ids) {
            j.g(ids, "ids");
            return new WorkQuery(ids, null, null, null, 14, null);
        }

        public final WorkQuery fromStates(List<? extends WorkInfo.State> states) {
            j.g(states, "states");
            return new WorkQuery(null, null, null, states, 7, null);
        }

        public final WorkQuery fromTags(List<String> tags) {
            j.g(tags, "tags");
            return new WorkQuery(null, null, tags, null, 11, null);
        }

        public final WorkQuery fromUniqueWorkNames(String... uniqueWorkNames) {
            j.g(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, C1129o.z(uniqueWorkNames), null, null, 13, null);
        }

        private Companion() {
        }

        public final WorkQuery fromIds(UUID... ids) {
            j.g(ids, "ids");
            return new WorkQuery(C1129o.z(ids), null, null, null, 14, null);
        }

        public final WorkQuery fromStates(WorkInfo.State... states) {
            j.g(states, "states");
            return new WorkQuery(null, null, null, C1129o.z(states), 7, null);
        }

        public final WorkQuery fromTags(String... tags) {
            j.g(tags, "tags");
            return new WorkQuery(null, null, C1129o.z(tags), null, 11, null);
        }

        public final WorkQuery fromUniqueWorkNames(List<String> uniqueWorkNames) {
            j.g(uniqueWorkNames, "uniqueWorkNames");
            return new WorkQuery(null, uniqueWorkNames, null, null, 13, null);
        }
    }

    public WorkQuery() {
        this(null, null, null, null, 15, null);
    }

    public static final WorkQuery fromIds(List<UUID> list) {
        return Companion.fromIds(list);
    }

    public static final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
        return Companion.fromStates(list);
    }

    public static final WorkQuery fromTags(List<String> list) {
        return Companion.fromTags(list);
    }

    public static final WorkQuery fromUniqueWorkNames(List<String> list) {
        return Companion.fromUniqueWorkNames(list);
    }

    public final List<UUID> getIds() {
        return this.ids;
    }

    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQuery(List<UUID> ids, List<String> uniqueWorkNames, List<String> tags, List<? extends WorkInfo.State> states) {
        j.g(ids, "ids");
        j.g(uniqueWorkNames, "uniqueWorkNames");
        j.g(tags, "tags");
        j.g(states, "states");
        this.ids = ids;
        this.uniqueWorkNames = uniqueWorkNames;
        this.tags = tags;
        this.states = states;
    }

    public static final WorkQuery fromIds(UUID... uuidArr) {
        return Companion.fromIds(uuidArr);
    }

    public static final WorkQuery fromStates(WorkInfo.State... stateArr) {
        return Companion.fromStates(stateArr);
    }

    public static final WorkQuery fromTags(String... strArr) {
        return Companion.fromTags(strArr);
    }

    public static final WorkQuery fromUniqueWorkNames(String... strArr) {
        return Companion.fromUniqueWorkNames(strArr);
    }

    public WorkQuery(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list, (i & 2) != 0 ? C1112C.f9377a : list2, (i & 4) != 0 ? C1112C.f9377a : list3, (i & 8) != 0 ? C1112C.f9377a : list4);
    }
}
