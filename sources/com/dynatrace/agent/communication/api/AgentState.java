package com.dynatrace.agent.communication.api;

import androidx.camera.core.impl.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AgentState {

    public static final class Disabled extends AgentState {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public int hashCode() {
            return 264509867;
        }

        public String toString() {
            return "Disabled";
        }
    }

    public static final class Enabled extends AgentState {
        private final boolean onlyHighPriorityEvents;

        public Enabled(boolean z4) {
            super(null);
            this.onlyHighPriorityEvents = z4;
        }

        public static /* synthetic */ Enabled copy$default(Enabled enabled, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z4 = enabled.onlyHighPriorityEvents;
            }
            return enabled.copy(z4);
        }

        public final boolean component1() {
            return this.onlyHighPriorityEvents;
        }

        public final Enabled copy(boolean z4) {
            return new Enabled(z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enabled) && this.onlyHighPriorityEvents == ((Enabled) obj).onlyHighPriorityEvents;
        }

        public final boolean getOnlyHighPriorityEvents() {
            return this.onlyHighPriorityEvents;
        }

        public int hashCode() {
            return this.onlyHighPriorityEvents ? 1231 : 1237;
        }

        public String toString() {
            return a.q(new StringBuilder("Enabled(onlyHighPriorityEvents="), this.onlyHighPriorityEvents, ')');
        }
    }

    public /* synthetic */ AgentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AgentState() {
    }
}
