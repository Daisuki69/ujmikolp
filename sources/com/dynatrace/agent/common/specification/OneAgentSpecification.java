package com.dynatrace.agent.common.specification;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentSpecification {

    public static final class BeaconSpecifications {
        public static final int BEACON_SIZE_KIB_DEFAULT = 1024;
        public static final boolean CAPTURE_DEFAULT = true;
        public static final int EVENT_SIZE_KIB_DEFAULT = 256;
        public static final BeaconSpecifications INSTANCE = new BeaconSpecifications();
        public static final int MAX_BEACON_SIZE_KIB = 10240;
        public static final int MAX_EVENT_SIZE_KIB = 1024;
        public static final int MIN_BEACON_SIZE_KIB = 256;
        public static final int MIN_EVENT_SIZE_KIB = 128;
        public static final long REVISION_DEFAULT = 0;

        private BeaconSpecifications() {
        }
    }
}
