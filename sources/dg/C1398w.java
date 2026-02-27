package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.File;
import dde.protobuf.fragments.Resolution;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1398w extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd52B"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        Resolution resolutionDecode = null;
        String strDecode4 = null;
        String strDecode5 = null;
        String strDecode6 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new File(strDecode, strDecode2, strDecode3, resolutionDecode, strDecode4, strDecode5, strDecode6, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    strDecode3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    resolutionDecode = Resolution.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    strDecode4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    strDecode5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    strDecode6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        File file = (File) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd52u"));
        kotlin.jvm.internal.j.g(file, numX49.tnTj78("bd52V"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, file.getName());
        protoAdapter.encodeWithTag(protoWriter, 2, file.getContentType());
        protoAdapter.encodeWithTag(protoWriter, 3, file.getSize());
        Resolution.ADAPTER.encodeWithTag(protoWriter, 4, file.getDimension());
        protoAdapter.encodeWithTag(protoWriter, 5, file.getCreatedDate());
        protoAdapter.encodeWithTag(protoWriter, 6, file.getPath());
        protoAdapter.encodeWithTag(protoWriter, 7, file.getVolumeName());
        protoWriter.writeBytes(file.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        File file = (File) obj;
        kotlin.jvm.internal.j.g(file, numX49.tnTj78("bd52d"));
        int size = file.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(7, file.getVolumeName()) + protoAdapter.encodedSizeWithTag(6, file.getPath()) + protoAdapter.encodedSizeWithTag(5, file.getCreatedDate()) + Resolution.ADAPTER.encodedSizeWithTag(4, file.getDimension()) + protoAdapter.encodedSizeWithTag(3, file.getSize()) + protoAdapter.encodedSizeWithTag(2, file.getContentType()) + protoAdapter.encodedSizeWithTag(1, file.getName()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        File file = (File) obj;
        kotlin.jvm.internal.j.g(file, numX49.tnTj78("bd52i"));
        Resolution dimension = file.getDimension();
        return File.copy$default(file, null, null, null, dimension != null ? Resolution.ADAPTER.redact(dimension) : null, null, null, null, ByteString.EMPTY, 119, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        File file = (File) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd52S"));
        kotlin.jvm.internal.j.g(file, numX49.tnTj78("bd52j"));
        reverseProtoWriter.writeBytes(file.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, file.getVolumeName());
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, file.getPath());
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, file.getCreatedDate());
        Resolution.ADAPTER.encodeWithTag(reverseProtoWriter, 4, file.getDimension());
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, file.getSize());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, file.getContentType());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, file.getName());
    }
}
