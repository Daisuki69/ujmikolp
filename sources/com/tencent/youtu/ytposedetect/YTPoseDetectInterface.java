package com.tencent.youtu.ytposedetect;

import android.content.Context;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState;
import com.tencent.youtu.sdkkitframework.liveness.d;
import com.tencent.youtu.sdkkitframework.liveness.o;
import com.tencent.youtu.sdkkitframework.liveness.p;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class YTPoseDetectInterface {
    public static final String TAG = "YoutuFaceDetect";
    public static final String VERSION = "3.6.0";
    public static c mCheckResult = null;
    public static int mInitModel = 0;
    public static boolean mIsStarted = false;
    public static int mModelRetainCount = 0;
    public static com.tencent.youtu.ytposedetect.manager.a mPoseDetectProcessManager = null;
    public static int mRotateTag = 1;
    public static b sPoseDetectOnFrame;

    public interface a {
        void a(byte[] bArr, int i, int i4);
    }

    public interface b {
    }

    public interface c {
        void a();

        void onFailed(int i, String str, String str2);
    }

    public static boolean callbackFrame(byte[] bArr, int i, int i4, int i6) {
        b bVar = sPoseDetectOnFrame;
        if (bVar != null) {
            return ((ActionLivenessState.j) bVar).a(bArr, i, i4, i6);
        }
        return false;
    }

    public static void callbackFrameList(YTActRefImage[] yTActRefImageArr) {
        int i;
        String str;
        b bVar = sPoseDetectOnFrame;
        if (bVar != null) {
            YtLogger.o("ActionLivenessState", "action video error,conservation video,frame count:" + yTActRefImageArr.length);
            p pVar = ActionLivenessState.this.m;
            String[] strArrSplit = pVar.f.split("&");
            if (strArrSplit.length > 0) {
                i = 0;
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split("=");
                    if (strArrSplit2.length > 1 && strArrSplit2[0].equals("action_video_shorten_strategy")) {
                        i = Integer.parseInt(strArrSplit2[1]);
                    }
                }
            } else {
                i = 0;
            }
            if (i != 1) {
                StringBuilder sb2 = new StringBuilder();
                if (strArrSplit.length > 0) {
                    for (String str3 : strArrSplit) {
                        String[] strArrSplit3 = str3.split("=");
                        if (strArrSplit3.length > 1 && !strArrSplit3[0].equals("action_video_shorten_strategy") && !strArrSplit3[0].equals("reflect_images_shorten_strategy")) {
                            sb2.append(strArrSplit3[0]);
                            sb2.append("=");
                            sb2.append(strArrSplit3[1]);
                            sb2.append("&");
                        }
                    }
                }
                sb2.append("reflect_images_shorten_strategy=1&action_video_shorten_strategy=1");
                pVar.f = sb2.toString();
            }
            pVar.h = pVar.f16022a.getSupportCodecJSONStr();
            JSONArray jSONArray = new JSONArray();
            for (YTActRefImage yTActRefImage : yTActRefImageArr) {
                if (yTActRefImage != null && (str = yTActRefImage.encodeImage) != null) {
                    jSONArray.put(new YTImageData(yTActRefImage.f16037w, yTActRefImage.h, str).toJSON64Img());
                }
            }
            if (pVar.f16025g == null) {
                pVar.f16025g = jSONArray;
                return;
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    pVar.f16025g.put(jSONArray.get(i4));
                } catch (JSONException e) {
                    YtLogger.e(TtmlNode.TAG_P, "JSONArray put error", e);
                }
            }
        }
    }

    public static YTActRefData getActReflectData() {
        return YTPoseDetectJNIInterface.getActionReflectData(mPoseDetectProcessManager.f16041b);
    }

    public static void getBestImage(a aVar, boolean z4) {
        int i = z4 ? mPoseDetectProcessManager.f16041b : 1;
        byte[] bestImage = YTPoseDetectJNIInterface.getBestImage();
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            com.tencent.youtu.ytposedetect.manager.a aVar2 = mPoseDetectProcessManager;
            aVar.a(bestImage, aVar2.f16042d, aVar2.c);
        } else {
            com.tencent.youtu.ytposedetect.manager.a aVar3 = mPoseDetectProcessManager;
            aVar.a(bestImage, aVar3.c, aVar3.f16042d);
        }
    }

    public static com.tencent.youtu.ytposedetect.a getEyeImage(int i) {
        com.tencent.youtu.ytposedetect.a aVar = new com.tencent.youtu.ytposedetect.a();
        YTPoseDetectJNIInterface.getEyeImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i4 = mPoseDetectProcessManager.f16042d;
            return aVar;
        }
        int i6 = mPoseDetectProcessManager.c;
        return aVar;
    }

    public static com.tencent.youtu.ytposedetect.a getMouthImage(int i) {
        com.tencent.youtu.ytposedetect.a aVar = new com.tencent.youtu.ytposedetect.a();
        YTPoseDetectJNIInterface.getMouthImage(i);
        if (i == 5 || i == 6 || i == 7 || i == 8) {
            int i4 = mPoseDetectProcessManager.f16042d;
            return aVar;
        }
        int i6 = mPoseDetectProcessManager.c;
        return aVar;
    }

    public static String getVersion() {
        return "jar3.6.0_native" + YTPoseDetectJNIInterface.getVersion();
    }

    public static int initModel() {
        try {
            YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] ---");
            if (mInitModel > 0) {
                YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.initModel] has already inited.");
                mInitModel++;
                return 0;
            }
            int iInitModel = YTPoseDetectJNIInterface.initModel("");
            if (iInitModel != 0) {
                return iInitModel;
            }
            mPoseDetectProcessManager = new com.tencent.youtu.ytposedetect.manager.a();
            mInitModel++;
            return 0;
        } catch (Exception e) {
            YTPoseDetectJNIInterface.nativeLog(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            Log.e(TAG, "initModel failed. message: " + Log.getStackTraceString(e));
            return 10;
        }
    }

    public static boolean isDetecting() {
        com.tencent.youtu.ytposedetect.manager.a aVar = mPoseDetectProcessManager;
        return aVar != null && aVar.f16040a;
    }

    public static void noticeFailed(int i, String str, String str2) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeFailed] resultCode: " + i + " \r\nmessage: " + str + " \r\ntips: " + str2);
        mCheckResult.onFailed(i, str, str2);
        mCheckResult = null;
        mIsStarted = false;
    }

    public static void noticeSuccess() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.noticeSuccess] ---");
        mCheckResult.a();
        mCheckResult = null;
        mIsStarted = true;
    }

    public static void poseDetect(PoseDetectData poseDetectData, b bVar, int i) {
        JSONArray jSONArray;
        sPoseDetectOnFrame = bVar;
        if (mInitModel <= 0) {
            ((ActionLivenessState.j) bVar).a(2, "Not init model on poseDetect.", "Call YTPoseDetectInterface.initModel() before.");
            return;
        }
        if (!mIsStarted) {
            ((ActionLivenessState.j) bVar).a(3, "Not call start() interface before.", "Call YTPoseDetectInterface.start() before.");
            return;
        }
        com.tencent.youtu.ytposedetect.manager.a aVar = mPoseDetectProcessManager;
        aVar.getClass();
        aVar.c = poseDetectData.frameW;
        aVar.f16042d = poseDetectData.frameH;
        int iPoseDetect = YTPoseDetectJNIInterface.poseDetect(poseDetectData);
        ActionLivenessState.j jVar = (ActionLivenessState.j) bVar;
        ActionLivenessState actionLivenessState = ActionLivenessState.this;
        actionLivenessState.f15872u = "";
        actionLivenessState.f15873v = null;
        if (iPoseDetect == 1) {
            YtLogger.d("ActionLivenessState", "Detect pose with sequence " + ActionLivenessState.this.h.length);
            if (YtFSM.getInstance().getContext().baseFunctionListener != null) {
                YtFSM.getInstance().getContext().baseFunctionListener.detectActionDone(ActionLivenessState.this.f15862g);
            }
            YtFSM.getInstance().sendFSMEvent(new com.tencent.youtu.sdkkitframework.liveness.a(jVar));
            ActionLivenessState actionLivenessState2 = ActionLivenessState.this;
            if (actionLivenessState2.a(actionLivenessState2.h, actionLivenessState2.i + 1)) {
                YtLogger.i("ActionLivenessState", "start check pose: " + ActionLivenessState.this.f15862g);
            } else {
                YtLogger.i("ActionLivenessState", "action seq all done");
                ActionLivenessState.this.f15864l = true;
            }
        } else if (iPoseDetect == -3) {
            actionLivenessState.f15873v = StringCode.FL_INCOMPLETE_FACE;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1026) {
            actionLivenessState.f15873v = StringCode.FL_POSE_KEEP;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -1025) {
            actionLivenessState.f15873v = o.a(actionLivenessState.f15861d);
            ActionLivenessState.this.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1029) {
            actionLivenessState.f15873v = o.b(actionLivenessState.e);
            ActionLivenessState.this.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1030) {
            actionLivenessState.f15873v = StringCode.FL_POSE_INCORRECT;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1031) {
            actionLivenessState.f15873v = StringCode.FL_POSE_OPEN_EYE;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1032) {
            actionLivenessState.f15873v = StringCode.FL_CLOSE_MOUTH;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == -1033) {
            actionLivenessState.f15873v = StringCode.FL_ACT_SCREEN_SHAKING;
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_NOTPASS;
        } else if (iPoseDetect == 0) {
            actionLivenessState.f15874w = StateEvent.ActionValue.STAGE_PASS;
        } else if (iPoseDetect == -5) {
            YtLogger.w("ActionLivenessState", "Act failed " + iPoseDetect, null);
            ActionLivenessState.this.f15872u = StringCode.FL_ACT_SCREEN_SHAKING;
        } else if (iPoseDetect != -1 && iPoseDetect != 0) {
            YtLogger.w("ActionLivenessState", "Act failed " + iPoseDetect, null);
        }
        YtSDKStats.getInstance().reportInfo("pose state " + iPoseDetect);
        if (YTPoseDetectJNIInterface.canReflect()) {
            CommonUtils.benchMarkBegin("make_pack_use_time_best_img");
            ActionLivenessState.this.f15867p = getActReflectData();
            YTActRefImage yTActRefImage = ActionLivenessState.this.f15867p.best;
            if (yTActRefImage == null || yTActRefImage.image.length == 0) {
                YtSDKStats.getInstance().reportError(4194304, "pose detect error");
                YtFSM.getInstance().sendFSMEvent(new com.tencent.youtu.sdkkitframework.liveness.b(jVar));
                reset();
            } else {
                OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_best_img"));
            }
        }
        if (YTPoseDetectJNIInterface.isRecordingDone()) {
            com.tencent.youtu.ytposedetect.manager.a aVar2 = mPoseDetectProcessManager;
            int i4 = aVar2.f16041b;
            int i6 = (i == 1 && (i4 == 5 || i4 == 6 || i4 == 7 || i4 == 8)) ? aVar2.f16042d : aVar2.c;
            int i10 = (i == 1 && (i4 == 5 || i4 == 6 || i4 == 7 || i4 == 8)) ? aVar2.c : aVar2.f16042d;
            YTPoseDetectJNIInterface.getOneActionFrame(i10, i6);
            ActionLivenessState actionLivenessState3 = ActionLivenessState.this;
            if (!actionLivenessState3.f15864l) {
                reset();
                return;
            }
            try {
                p pVar = actionLivenessState3.m;
                if (pVar != null) {
                    pVar.f16022a.stopEncoding();
                }
            } catch (Exception e) {
                YtLogger.d("ActionLivenessState", "encode stop error! " + Log.getStackTraceString(e));
            }
            ActionLivenessState actionLivenessState4 = ActionLivenessState.this;
            p pVar2 = actionLivenessState4.m;
            if (pVar2 == null || (jSONArray = pVar2.f16025g) == null) {
                ActionData actionData = YTPoseDetectJNIInterface.getActionData();
                if (!actionData.isSuccess) {
                    YtFSM.getInstance().sendFSMEvent(new d(jVar));
                    return;
                }
                ActionLivenessState.this.stateData.put("frames", actionData);
            } else {
                actionLivenessState4.stateData.put("frames", jSONArray.toString());
                YtFSM.getInstance().sendFSMEvent(new com.tencent.youtu.sdkkitframework.liveness.c(jVar, OperateInfoManager.getInstance().conservationVideoErrorData(ActionLivenessState.this.m.h, Integer.valueOf(ErrorCode.YT_SDK_ACTION_VIDEO_CONSERVATION_SUCCESS))));
                ActionLivenessState actionLivenessState5 = ActionLivenessState.this;
                actionLivenessState5.f15837C = actionLivenessState5.m.f;
                YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE)).updateDataBy("control_config", ActionLivenessState.this.f15837C);
            }
            ActionLivenessState actionLivenessState6 = ActionLivenessState.this;
            actionLivenessState6.getClass();
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                actionLivenessState6.stateData.put("act_reflect_data", actionLivenessState6.f15867p);
                actionLivenessState6.f15863k = YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE;
            } else {
                YTImageData yTImageData = new YTImageData(YTPoseDetectJNIInterface.getBestImage(), i10, i6);
                yTImageData.imgData = yTImageData.bgr2JPEG(100);
                actionLivenessState6.stateData.put("best_frame", yTImageData);
                actionLivenessState6.f15863k = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
            }
        }
    }

    public static void releaseModel() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTFacePreviewInterface.finalize] ---");
        sPoseDetectOnFrame = null;
        int i = mInitModel - 1;
        mInitModel = i;
        if (i <= 0) {
            YTPoseDetectJNIInterface.releaseAll();
            mInitModel = 0;
        }
    }

    public static void reset() {
        YTPoseDetectJNIInterface.resetDetect();
    }

    public static void setSafetyLevel(int i) {
        if (i < 0 || i >= 3) {
            return;
        }
        YTPoseDetectJNIInterface.setSafetyLevel(i);
    }

    public static int start(Context context, int i, c cVar) {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.start] ---");
        if (cVar == null) {
            return -1;
        }
        mCheckResult = cVar;
        if (mInitModel <= 0) {
            noticeFailed(2, "Not init model.", "Call YTPoseDetectInterface.initModel() before.");
            return 0;
        }
        com.tencent.youtu.ytposedetect.manager.a aVar = mPoseDetectProcessManager;
        if (aVar.f16040a) {
            YTPoseDetectJNIInterface.nativeLog("FaceDetectProcess", "Restart FaceDetect process. YTPoseDetectInterface.stop() should be called before the next start, or maybe camera's parameter may be setting wrong.");
        }
        aVar.f16041b = i;
        aVar.f16040a = true;
        noticeSuccess();
        return 0;
    }

    public static void stop() {
        YTPoseDetectJNIInterface.nativeLog(TAG, "[YTPoseDetectInterface.stop] ---");
        com.tencent.youtu.ytposedetect.manager.a aVar = mPoseDetectProcessManager;
        if (aVar != null && aVar.f16040a) {
            aVar.f16040a = false;
            YTPoseDetectJNIInterface.resetDetect();
        }
        mIsStarted = false;
    }

    public static com.tencent.youtu.ytposedetect.a getBestImage(int i) {
        com.tencent.youtu.ytposedetect.a aVar = new com.tencent.youtu.ytposedetect.a();
        YTPoseDetectJNIInterface.getBestImage();
        if (i != 5 && i != 6 && i != 7 && i != 8) {
            int i4 = mPoseDetectProcessManager.c;
            return aVar;
        }
        int i6 = mPoseDetectProcessManager.f16042d;
        return aVar;
    }
}
