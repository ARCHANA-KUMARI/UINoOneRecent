package com.robosoft.archanakumari.uinoonerecent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by archanakumari on 1/1/16.
 */
public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.LayoutHolder>{

    private Context mContext;
    static  int count = 0;
    int listofImages[] = {R.drawable.female1,R.drawable.female2,R.drawable.female3,R.drawable.female4};
    String data[]={"David","Hi this is David","Liza","Hi this is Liza","Mariya","Hi this Maria","Alena","Hi this is Alena"};
    private  View mOneRow;
    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public LayoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType%2==0) {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.child, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");
        }
        else
        {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childwithbutton, parent, false);
        }
        LayoutHolder layoutHolder = new LayoutHolder(mOneRow);
        return layoutHolder;
    }

    @Override
    public void onBindViewHolder(LayoutHolder holder, int position) {

        if (position % 2 == 0) {
            int i=0;
            Log.i("HEllo", "I am in obBindViewHolder");
            holder.mImageoflayoutone.setImageResource(listofImages[i+count]);
            i++;
            holder.mTextname.setText("David");
            holder.mTextDescription.setText("Hi this is David");
            holder.mImageoflayouttwo.setImageResource(listofImages[i+count]);
            holder.mTextnametwo.setText("Liza");
            holder.mTextDescriptiontwo.setText("Hi this is LIZA");

           /* holder.mTextHeading.setText(data[count+i]);
            i++;
            holder.mTextSubHeading.setText(data[count+i]);
            i++;
            holder.mTextDescription.setText(data[count+i]);
            holder.mImage.setImageResource(mListofImages[count]);
            count++;*/
            count++;

        } else{

            holder.mImageViewofchildtwo.setImageResource(R.drawable.male1);
            holder.mTextRequest.setText("Friend Request");
            holder.mTextnameOfchiletwo.setText("Alan Devis");
            holder.mTextDescriptionofchildtwo.setText("Hi Alice I `d like to add you to my contact list");
            holder.mIgnorebtn.setText("Ignore");
            holder.mAcceptbtn.setText("Accept");
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
    class LayoutHolder extends RecyclerView.ViewHolder{

         private ImageView mImageoflayoutone;
         private TextView mTextname;
         private TextView mTextDescription;
         private ImageView mImageoflayouttwo;
         private TextView mTextnametwo;
         private TextView mTextDescriptiontwo;
         private ImageView mImageViewofchildtwo;
         private TextView mTextRequest;
         private TextView mTextnameOfchiletwo;
         private TextView mTextDescriptionofchildtwo;
         private Button mIgnorebtn;
         private Button mAcceptbtn;

        public LayoutHolder(View itemView) {
            super(itemView);
            mImageoflayoutone = (ImageView) itemView.findViewById(R.id.imag1);
            mTextname = (TextView) itemView.findViewById(R.id.firstsubtext1);
            mTextDescription = (TextView) itemView.findViewById(R.id.firstsubtext2);
            mImageoflayouttwo = (ImageView) itemView.findViewById(R.id.imag2);
            mTextnametwo = (TextView) itemView.findViewById(R.id.secondsubtext1);
            mTextDescriptiontwo = (TextView) itemView.findViewById(R.id.secondsuntext2);
            mImageViewofchildtwo = (ImageView) itemView.findViewById(R.id.imag3);
            mTextRequest = (TextView) itemView.findViewById(R.id.thirdsubtext1);
            mTextnameOfchiletwo = (TextView) itemView.findViewById(R.id.thirdsubtext2);
            mTextDescriptionofchildtwo = (TextView) itemView.findViewById(R.id.thirdsubtext3);
            mIgnorebtn = (Button) itemView.findViewById(R.id.thirdsubbtn1);
            mAcceptbtn = (Button) itemView.findViewById(R.id.thirdsubbtn2);

        }

    }
}
