package com.paymaya.domain.model;

import We.s;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FileUploadResponse;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FileUploadResponse extends C$AutoValue_FileUploadResponse {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(FileUploadResponse)";
        }

        @Override // com.google.gson.y
        public FileUploadResponse read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            FileUploadResponse.Builder builderSBuilder = FileUploadResponse.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "contentType":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mContentType((String) yVarH.read(aVar));
                            break;
                        case "url":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mUrl((String) yVarH2.read(aVar));
                            break;
                        case "uploadUrl":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mUploadUrl((String) yVarH3.read(aVar));
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, FileUploadResponse fileUploadResponse) throws IOException {
            if (fileUploadResponse == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("uploadUrl");
            if (fileUploadResponse.mUploadUrl() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, fileUploadResponse.mUploadUrl());
            }
            bVar.m(ImagesContract.URL);
            if (fileUploadResponse.mUrl() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, fileUploadResponse.mUrl());
            }
            bVar.m("contentType");
            if (fileUploadResponse.mContentType() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, fileUploadResponse.mContentType());
            }
            bVar.k();
        }
    }

    public AutoValue_FileUploadResponse(final String str, final String str2, final String str3) {
        new FileUploadResponse(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_FileUploadResponse
            private final String mContentType;
            private final String mUploadUrl;
            private final String mUrl;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FileUploadResponse$Builder */
            public static class Builder extends FileUploadResponse.Builder {
                private String mContentType;
                private String mUploadUrl;
                private String mUrl;

                public /* synthetic */ Builder(FileUploadResponse fileUploadResponse, int i) {
                    this(fileUploadResponse);
                }

                @Override // com.paymaya.domain.model.FileUploadResponse.Builder
                public FileUploadResponse build() {
                    String strI = this.mUploadUrl == null ? " mUploadUrl" : "";
                    if (this.mUrl == null) {
                        strI = s.i(strI, " mUrl");
                    }
                    if (this.mContentType == null) {
                        strI = s.i(strI, " mContentType");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_FileUploadResponse(this.mUploadUrl, this.mUrl, this.mContentType);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.FileUploadResponse.Builder
                public FileUploadResponse.Builder mContentType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mContentType");
                    }
                    this.mContentType = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.FileUploadResponse.Builder
                public FileUploadResponse.Builder mUploadUrl(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mUploadUrl");
                    }
                    this.mUploadUrl = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.FileUploadResponse.Builder
                public FileUploadResponse.Builder mUrl(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mUrl");
                    }
                    this.mUrl = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(FileUploadResponse fileUploadResponse) {
                    this.mUploadUrl = fileUploadResponse.mUploadUrl();
                    this.mUrl = fileUploadResponse.mUrl();
                    this.mContentType = fileUploadResponse.mContentType();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mUploadUrl");
                }
                this.mUploadUrl = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mUrl");
                }
                this.mUrl = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mContentType");
                }
                this.mContentType = str3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof FileUploadResponse) {
                    FileUploadResponse fileUploadResponse = (FileUploadResponse) obj;
                    if (this.mUploadUrl.equals(fileUploadResponse.mUploadUrl()) && this.mUrl.equals(fileUploadResponse.mUrl()) && this.mContentType.equals(fileUploadResponse.mContentType())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((this.mUploadUrl.hashCode() ^ 1000003) * 1000003) ^ this.mUrl.hashCode()) * 1000003) ^ this.mContentType.hashCode();
            }

            @Override // com.paymaya.domain.model.FileUploadResponse
            @InterfaceC1498b("contentType")
            public String mContentType() {
                return this.mContentType;
            }

            @Override // com.paymaya.domain.model.FileUploadResponse
            @InterfaceC1498b("uploadUrl")
            public String mUploadUrl() {
                return this.mUploadUrl;
            }

            @Override // com.paymaya.domain.model.FileUploadResponse
            @InterfaceC1498b(ImagesContract.URL)
            public String mUrl() {
                return this.mUrl;
            }

            @Override // com.paymaya.domain.model.FileUploadResponse
            public FileUploadResponse.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("FileUploadResponse{mUploadUrl=");
                sb2.append(this.mUploadUrl);
                sb2.append(", mUrl=");
                sb2.append(this.mUrl);
                sb2.append(", mContentType=");
                return s.p(sb2, this.mContentType, "}");
            }
        };
    }
}
