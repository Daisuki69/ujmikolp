package com.dynatrace.agent.communication.network.response;

import androidx.camera.core.impl.a;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.time.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResponseResult {

    public static final class Retry extends ResponseResult {
        private final String retryReason;
        private final ServerDataUpdate serverDataUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(String retryReason, ServerDataUpdate serverDataUpdate) {
            super(null);
            j.g(retryReason, "retryReason");
            this.retryReason = retryReason;
            this.serverDataUpdate = serverDataUpdate;
        }

        public static /* synthetic */ Retry copy$default(Retry retry, String str, ServerDataUpdate serverDataUpdate, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retry.retryReason;
            }
            if ((i & 2) != 0) {
                serverDataUpdate = retry.serverDataUpdate;
            }
            return retry.copy(str, serverDataUpdate);
        }

        public final String component1() {
            return this.retryReason;
        }

        public final ServerDataUpdate component2() {
            return this.serverDataUpdate;
        }

        public final Retry copy(String retryReason, ServerDataUpdate serverDataUpdate) {
            j.g(retryReason, "retryReason");
            return new Retry(retryReason, serverDataUpdate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Retry)) {
                return false;
            }
            Retry retry = (Retry) obj;
            return j.b(this.retryReason, retry.retryReason) && j.b(this.serverDataUpdate, retry.serverDataUpdate);
        }

        public final String getRetryReason() {
            return this.retryReason;
        }

        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            int iHashCode = this.retryReason.hashCode() * 31;
            ServerDataUpdate serverDataUpdate = this.serverDataUpdate;
            return iHashCode + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
        }

        public String toString() {
            return "Retry(retryReason=" + this.retryReason + ", serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    public static final class RetryNoConnectivity extends ResponseResult {
        private final String retryReason;

        /* JADX WARN: Multi-variable type inference failed */
        public RetryNoConnectivity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RetryNoConnectivity copy$default(RetryNoConnectivity retryNoConnectivity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retryNoConnectivity.retryReason;
            }
            return retryNoConnectivity.copy(str);
        }

        public final String component1() {
            return this.retryReason;
        }

        public final RetryNoConnectivity copy(String retryReason) {
            j.g(retryReason, "retryReason");
            return new RetryNoConnectivity(retryReason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryNoConnectivity) && j.b(this.retryReason, ((RetryNoConnectivity) obj).retryReason);
        }

        public final String getRetryReason() {
            return this.retryReason;
        }

        public int hashCode() {
            return this.retryReason.hashCode();
        }

        public String toString() {
            return a.n(new StringBuilder("RetryNoConnectivity(retryReason="), this.retryReason, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryNoConnectivity(String retryReason) {
            super(null);
            j.g(retryReason, "retryReason");
            this.retryReason = retryReason;
        }

        public /* synthetic */ RetryNoConnectivity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "No internet connection" : str);
        }
    }

    public static final class Success extends ResponseResult {
        private final ServerDataUpdate serverDataUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ServerDataUpdate serverDataUpdate) {
            super(null);
            j.g(serverDataUpdate, "serverDataUpdate");
            this.serverDataUpdate = serverDataUpdate;
        }

        public static /* synthetic */ Success copy$default(Success success, ServerDataUpdate serverDataUpdate, int i, Object obj) {
            if ((i & 1) != 0) {
                serverDataUpdate = success.serverDataUpdate;
            }
            return success.copy(serverDataUpdate);
        }

        public final ServerDataUpdate component1() {
            return this.serverDataUpdate;
        }

        public final Success copy(ServerDataUpdate serverDataUpdate) {
            j.g(serverDataUpdate, "serverDataUpdate");
            return new Success(serverDataUpdate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && j.b(this.serverDataUpdate, ((Success) obj).serverDataUpdate);
        }

        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            return this.serverDataUpdate.hashCode();
        }

        public String toString() {
            return "Success(serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    public static final class TooManyRequests extends ResponseResult {
        private final long delay;

        public /* synthetic */ TooManyRequests(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX INFO: renamed from: copy-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ TooManyRequests m160copyLRDsOJo$default(TooManyRequests tooManyRequests, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = tooManyRequests.delay;
            }
            return tooManyRequests.m162copyLRDsOJo(j);
        }

        /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name */
        public final long m161component1UwyO8pc() {
            return this.delay;
        }

        /* JADX INFO: renamed from: copy-LRDsOJo, reason: not valid java name */
        public final TooManyRequests m162copyLRDsOJo(long j) {
            return new TooManyRequests(j, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooManyRequests)) {
                return false;
            }
            long j = this.delay;
            long j6 = ((TooManyRequests) obj).delay;
            a.C0097a c0097a = kotlin.time.a.f18208b;
            return j == j6;
        }

        /* JADX INFO: renamed from: getDelay-UwyO8pc, reason: not valid java name */
        public final long m163getDelayUwyO8pc() {
            return this.delay;
        }

        public int hashCode() {
            long j = this.delay;
            a.C0097a c0097a = kotlin.time.a.f18208b;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "TooManyRequests(delay=" + ((Object) kotlin.time.a.h(this.delay)) + ')';
        }

        private TooManyRequests(long j) {
            super(null);
            this.delay = j;
        }
    }

    public static final class UnexpectedError extends ResponseResult {
        public static final UnexpectedError INSTANCE = new UnexpectedError();

        private UnexpectedError() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnexpectedError);
        }

        public int hashCode() {
            return 1881588853;
        }

        public String toString() {
            return "UnexpectedError";
        }
    }

    public /* synthetic */ ResponseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResponseResult() {
    }
}
