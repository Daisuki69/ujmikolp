package com.dynatrace.agent.communication;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CommunicationState {

    public static final class ConfigAwaiting extends CommunicationState {
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfigAwaiting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ConfigAwaiting copy$default(ConfigAwaiting configAwaiting, ConnectionStatus connectionStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionStatus = configAwaiting.connectionStatus;
            }
            return configAwaiting.copy(connectionStatus);
        }

        public final ConnectionStatus component1() {
            return this.connectionStatus;
        }

        public final ConfigAwaiting copy(ConnectionStatus connectionStatus) {
            j.g(connectionStatus, "connectionStatus");
            return new ConfigAwaiting(connectionStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigAwaiting) && this.connectionStatus == ((ConfigAwaiting) obj).connectionStatus;
        }

        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        public String toString() {
            return "ConfigAwaiting(connectionStatus=" + this.connectionStatus + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigAwaiting(ConnectionStatus connectionStatus) {
            super(null);
            j.g(connectionStatus, "connectionStatus");
            this.connectionStatus = connectionStatus;
        }

        public /* synthetic */ ConfigAwaiting(ConnectionStatus connectionStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ConnectionStatus.READY : connectionStatus);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConnectionStatus {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ ConnectionStatus[] $VALUES;
        public static final ConnectionStatus READY = new ConnectionStatus("READY", 0);
        public static final ConnectionStatus RETRYING = new ConnectionStatus("RETRYING", 1);
        public static final ConnectionStatus PAUSE_AFTER_TOO_MANY_REQUESTS = new ConnectionStatus("PAUSE_AFTER_TOO_MANY_REQUESTS", 2);

        private static final /* synthetic */ ConnectionStatus[] $values() {
            return new ConnectionStatus[]{READY, RETRYING, PAUSE_AFTER_TOO_MANY_REQUESTS};
        }

        static {
            ConnectionStatus[] connectionStatusArr$values = $values();
            $VALUES = connectionStatusArr$values;
            $ENTRIES = v0.h(connectionStatusArr$values);
        }

        private ConnectionStatus(String str, int i) {
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static ConnectionStatus valueOf(String str) {
            return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
        }

        public static ConnectionStatus[] values() {
            return (ConnectionStatus[]) $VALUES.clone();
        }
    }

    public static final class Inactive extends CommunicationState {
        public static final Inactive INSTANCE = new Inactive();

        private Inactive() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Inactive);
        }

        public int hashCode() {
            return 466411519;
        }

        public String toString() {
            return "Inactive";
        }
    }

    public static final class Off extends CommunicationState {
        public static final Off INSTANCE = new Off();

        private Off() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Off);
        }

        public int hashCode() {
            return 1273380187;
        }

        public String toString() {
            return "Off";
        }
    }

    public static final class Offline extends CommunicationState {
        public static final Offline INSTANCE = new Offline();

        private Offline() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Offline);
        }

        public int hashCode() {
            return 1236584399;
        }

        public String toString() {
            return "Offline";
        }
    }

    public static final class PendingData extends CommunicationState {
        public static final PendingData INSTANCE = new PendingData();

        private PendingData() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PendingData);
        }

        public int hashCode() {
            return 1397763533;
        }

        public String toString() {
            return "PendingData";
        }
    }

    public static final class Waiting extends CommunicationState {
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: Multi-variable type inference failed */
        public Waiting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Waiting copy$default(Waiting waiting, ConnectionStatus connectionStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionStatus = waiting.connectionStatus;
            }
            return waiting.copy(connectionStatus);
        }

        public final ConnectionStatus component1() {
            return this.connectionStatus;
        }

        public final Waiting copy(ConnectionStatus connectionStatus) {
            j.g(connectionStatus, "connectionStatus");
            return new Waiting(connectionStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Waiting) && this.connectionStatus == ((Waiting) obj).connectionStatus;
        }

        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        public String toString() {
            return "Waiting(connectionStatus=" + this.connectionStatus + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Waiting(ConnectionStatus connectionStatus) {
            super(null);
            j.g(connectionStatus, "connectionStatus");
            this.connectionStatus = connectionStatus;
        }

        public /* synthetic */ Waiting(ConnectionStatus connectionStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ConnectionStatus.READY : connectionStatus);
        }
    }

    public /* synthetic */ CommunicationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CommunicationState() {
    }
}
