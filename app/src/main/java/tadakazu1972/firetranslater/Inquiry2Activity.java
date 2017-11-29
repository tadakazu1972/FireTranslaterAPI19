package tadakazu1972.firetranslater;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.graphics.Color;

/**
 * Created by tadakazu on 2016/10/23.
 */

public class Inquiry2Activity extends AppCompatActivity {
    protected Inquiry2Activity mActivity = null;
    protected View mView = null;
    //選択言語番号
    private String mLangNum = null;
    //翻訳表示用TextView
    private TextView mText1 = null;
    private TextView mTextResult = null;
    //ボタン
    private Button mHead = null;
    private Button mEye = null;
    private Button mEar = null;
    private Button mNose = null;
    private Button mMouth = null;
    private Button mTooth = null;
    private Button mThroat = null;
    private Button mShoulder = null;
    private Button mStomach = null;
    private Button mChest = null;
    private Button mUpperBack = null;
    private Button mLowerBack = null;
    private Button mHandOrArm = null;
    private Button mFinger = null;
    private Button mButtocks = null;
    private Button mLegOrFoot = null;
    private Button mKnee = null;
    private Button mOther = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivity = this;
        mView = this.getWindow().getDecorView();
        setContentView(R.layout.inquiry2);
        //選択言語番号を呼び出し
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        mLangNum = sp.getString("language","1"); // 第２引数はkeyが存在しない時に返す初期値
        //翻訳表示TextView初期化
        initTextViews();
        //ボタン初期化
        initButtons();
    }

    private void initTextViews(){
        //text1
        mText1 = (TextView)findViewById(R.id.i21);
        String nameText1 = "i20" + mLangNum;
        int resourceIdText1 = getResources().getIdentifier(nameText1, "string", getPackageName());
        mText1.setText(resourceIdText1);
        //日本語の時はフォント、背景ともに白色にして見えなくする
        if(mLangNum.equals("0")) {
            mText1.setTextColor(Color.WHITE);
            mText1.setBackgroundResource(R.drawable.frame2);
        }
        //
        mTextResult = (TextView)findViewById(R.id.txtResult);
    }

    private void initButtons(){
        //頭
        mHead = (Button)findViewById(R.id.btnHead);
        String nameHead = "i21" + mLangNum;
        int resourceIdHead = getResources().getIdentifier(nameHead, "string", getPackageName());
        mHead.setText(resourceIdHead);
        mView.findViewById(R.id.btnHead).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i210";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //目
        mEye = (Button)findViewById(R.id.btnEye);
        String nameEye = "i22" + mLangNum;
        int resourceIdEye = getResources().getIdentifier(nameEye, "string", getPackageName());
        mEye.setText(resourceIdEye);
        mEye.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i220";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //耳
        mEar = (Button)findViewById(R.id.btnEar);
        String nameEar = "i23" + mLangNum;
        int resourceIdEar = getResources().getIdentifier(nameEar, "string", getPackageName());
        mEar.setText(resourceIdEar);
        mEar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i230";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //鼻
        mNose = (Button)findViewById(R.id.btnNose);
        String nameNose = "i24" + mLangNum;
        int resourceIdNose = getResources().getIdentifier(nameNose, "string", getPackageName());
        mNose.setText(resourceIdNose);
        mNose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i240";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //口
        mMouth = (Button)findViewById(R.id.btnMouth);
        String nameMouth = "i25" + mLangNum;
        int resourceIdMouth = getResources().getIdentifier(nameMouth, "string", getPackageName());
        mMouth.setText(resourceIdMouth);
        mMouth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i250";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //歯
        mTooth = (Button)findViewById(R.id.btnTooth);
        String nameTooth = "i26" + mLangNum;
        int resourceIdTooth = getResources().getIdentifier(nameTooth, "string", getPackageName());
        mTooth.setText(resourceIdTooth);
        mTooth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i260";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //喉
        mThroat = (Button)findViewById(R.id.btnThroat);
        String nameThroat = "i27" + mLangNum;
        int resourceIdThroat = getResources().getIdentifier(nameThroat, "string", getPackageName());
        mThroat.setText(resourceIdThroat);
        mThroat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i270";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //肩
        mShoulder = (Button)findViewById(R.id.btnShoulder);
        String nameShoulder = "i28" + mLangNum;
        int resourceIdShoulder = getResources().getIdentifier(nameShoulder, "string", getPackageName());
        mShoulder.setText(resourceIdShoulder);
        mShoulder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i280";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //腹
        mStomach = (Button)findViewById(R.id.btnStomach);
        String nameStomach = "i29" + mLangNum;
        int resourceIdStomach = getResources().getIdentifier(nameStomach, "string", getPackageName());
        mStomach.setText(resourceIdStomach);
        mStomach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i290";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //胸
        mChest = (Button)findViewById(R.id.btnChest);
        String nameChest = "i210" + mLangNum;
        int resourceIdChest = getResources().getIdentifier(nameChest, "string", getPackageName());
        mChest.setText(resourceIdChest);
        mChest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2100";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //背中
        mUpperBack = (Button)findViewById(R.id.btnUpperBack);
        String nameUpperBack = "i211" + mLangNum;
        int resourceIdUpperBack = getResources().getIdentifier(nameUpperBack, "string", getPackageName());
        mUpperBack.setText(resourceIdUpperBack);
        mUpperBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2110";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //腰
        mLowerBack = (Button)findViewById(R.id.btnLowerBack);
        String nameLowerBack = "i212" + mLangNum;
        int resourceIdLowerBack = getResources().getIdentifier(nameLowerBack, "string", getPackageName());
        mLowerBack.setText(resourceIdLowerBack);
        mLowerBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2120";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //手または腕
        mHandOrArm = (Button)findViewById(R.id.btnHandOrArm);
        String nameHandOrArm = "i213" + mLangNum;
        int resourceIdHandOrArm = getResources().getIdentifier(nameHandOrArm, "string", getPackageName());
        mHandOrArm.setText(resourceIdHandOrArm);
        mHandOrArm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2130";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //指
        mFinger = (Button)findViewById(R.id.btnFinger);
        String nameFinger = "i214" + mLangNum;
        int resourceIdFinger = getResources().getIdentifier(nameFinger, "string", getPackageName());
        mFinger.setText(resourceIdFinger);
        mFinger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2140";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //臀部
        mButtocks = (Button)findViewById(R.id.btnButtocks);
        String nameButtocks = "i215" + mLangNum;
        int resourceIdButtocks = getResources().getIdentifier(nameButtocks, "string", getPackageName());
        mButtocks.setText(resourceIdButtocks);
        mButtocks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2150";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //足
        mLegOrFoot = (Button)findViewById(R.id.btnLegOrFoot);
        String nameLegOrFoot = "i216" + mLangNum;
        int resourceIdLegOrFoot = getResources().getIdentifier(nameLegOrFoot, "string", getPackageName());
        mLegOrFoot.setText(resourceIdLegOrFoot);
        mLegOrFoot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2160";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //膝
        mKnee = (Button)findViewById(R.id.btnKnee);
        String nameKnee = "i217" + mLangNum;
        int resourceIdKnee = getResources().getIdentifier(nameKnee, "string", getPackageName());
        mKnee.setText(resourceIdKnee);
        mKnee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2170";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //その他
        mOther = (Button)findViewById(R.id.btnOther);
        String nameOther = "i218" + mLangNum;
        int resourceIdOther = getResources().getIdentifier(nameOther, "string", getPackageName());
        mOther.setText(resourceIdOther);
        mOther.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = "i2180";
                int resourceId = getResources().getIdentifier(name, "string", getPackageName());
                mTextResult.setText(resourceId);
                //SharedPreferencesに保存
                setSharedPreferences(resourceId);
            }
        });
        //クリア
        mView.findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mTextResult.setText("");
                //SharedPreferenceもクリアしておく
                SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
                sp.edit().putString("result2", "").apply();
            }
        });
        //ホーム
        mView.findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mActivity, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setSharedPreferences(int resId){
        //翻訳結果で用いるためSharedPreferenceに登録
        String s = getResources().getString(resId);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mActivity);
        sp.edit().putString("result2", s).apply();
    }
}
