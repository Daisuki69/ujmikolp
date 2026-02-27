package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FileUploadRequest;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FileUploadRequest extends C$AutoValue_FileUploadRequest {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(FileUploadRequest)";
        }

        @Override // com.google.gson.y
        public FileUploadRequest read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            FileUploadRequest.Builder builderSBuilder = FileUploadRequest.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("fileName")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mFilename((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, FileUploadRequest fileUploadRequest) throws IOException {
            if (fileUploadRequest == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("fileName");
            if (fileUploadRequest.mFilename() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, fileUploadRequest.mFilename());
            }
            bVar.k();
        }
    }

    public AutoValue_FileUploadRequest(final String str) {
        new FileUploadRequest(str) { // from class: com.paymaya.domain.model.$AutoValue_FileUploadRequest
            private final String mFilename;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FileUploadRequest$Builder */
            public static class Builder extends FileUploadRequest.Builder {
                private String mFilename;

                public /* synthetic */ Builder(FileUploadRequest fileUploadRequest, int i) {
                    this(fileUploadRequest);
                }

                @Override // com.paymaya.domain.model.FileUploadRequest.Builder
                public FileUploadRequest build() {
                    String str = this.mFilename == null ? " mFilename" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_FileUploadRequest(this.mFilename);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.FileUploadRequest.Builder
                public FileUploadRequest.Builder mFilename(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mFilename");
                    }
                    this.mFilename = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(FileUploadRequest fileUploadRequest) {
                    this.mFilename = fileUploadRequest.mFilename();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mFilename");
                }
                this.mFilename = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof FileUploadRequest) {
                    return this.mFilename.equals(((FileUploadRequest) obj).mFilename());
                }
                return false;
            }

            public int hashCode() {
                return this.mFilename.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.FileUploadRequest
            @InterfaceC1498b("fileName")
            public String mFilename() {
                return this.mFilename;
            }

            @Override // com.paymaya.domain.model.FileUploadRequest
            public FileUploadRequest.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.p(new StringBuilder("FileUploadRequest{mFilename="), this.mFilename, "}");
            }
        };
    }
}
