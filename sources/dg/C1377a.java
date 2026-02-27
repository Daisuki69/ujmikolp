package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Application;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1377a extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5a"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        String strDecode4 = null;
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Application(strDecode, strDecode2, arrayListJ, strDecode3, strDecode4, boolDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Application application = (Application) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5X"));
        kotlin.jvm.internal.j.g(application, numX49.tnTj78("bd5G"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, application.getId());
        protoAdapter.encodeWithTag(protoWriter, 2, application.getCategory());
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, application.getFeatures());
        protoAdapter.encodeWithTag(protoWriter, 4, application.getFirstInstalled());
        protoAdapter.encodeWithTag(protoWriter, 5, application.getLastUpdated());
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, application.isSystem());
        protoWriter.writeBytes(application.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Application application = (Application) obj;
        kotlin.jvm.internal.j.g(application, numX49.tnTj78("bd5v"));
        int size = application.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, application.isSystem()) + protoAdapter.encodedSizeWithTag(5, application.getLastUpdated()) + protoAdapter.encodedSizeWithTag(4, application.getFirstInstalled()) + protoAdapter.asRepeated().encodedSizeWithTag(3, application.getFeatures()) + protoAdapter.encodedSizeWithTag(2, application.getCategory()) + protoAdapter.encodedSizeWithTag(1, application.getId()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Application application = (Application) obj;
        kotlin.jvm.internal.j.g(application, numX49.tnTj78("bd57"));
        return Application.copy$default(application, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Application application = (Application) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd53"));
        kotlin.jvm.internal.j.g(application, numX49.tnTj78("bd5y"));
        reverseProtoWriter.writeBytes(application.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, application.isSystem());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, application.getLastUpdated());
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, application.getFirstInstalled());
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, application.getFeatures());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, application.getCategory());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, application.getId());
    }
}
