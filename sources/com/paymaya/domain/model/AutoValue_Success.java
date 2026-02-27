package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Success;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Success extends C$AutoValue_Success {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Success)";
        }

        @Override // com.google.gson.y
        public Success read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Success.Builder builderSBuilder = Success.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("message")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mMessage((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, Success success) throws IOException {
            if (success == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("message");
            if (success.mMessage() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, success.mMessage());
            }
            bVar.k();
        }
    }

    public AutoValue_Success(final String str) {
        new Success(str) { // from class: com.paymaya.domain.model.$AutoValue_Success
            private final String mMessage;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Success$Builder */
            public static class Builder extends Success.Builder {
                private String mMessage;

                public /* synthetic */ Builder(Success success, int i) {
                    this(success);
                }

                @Override // com.paymaya.domain.model.Success.Builder
                public Success build() {
                    String str = this.mMessage == null ? " mMessage" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_Success(this.mMessage);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.Success.Builder
                public Success.Builder mMessage(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMessage");
                    }
                    this.mMessage = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(Success success) {
                    this.mMessage = success.mMessage();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mMessage");
                }
                this.mMessage = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Success) {
                    return this.mMessage.equals(((Success) obj).mMessage());
                }
                return false;
            }

            public int hashCode() {
                return this.mMessage.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.Success
            @InterfaceC1498b("message")
            public String mMessage() {
                return this.mMessage;
            }

            @Override // com.paymaya.domain.model.Success
            public Success.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.p(new StringBuilder("Success{mMessage="), this.mMessage, "}");
            }
        };
    }
}
