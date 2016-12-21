package dudafmme.com.br.pocrecyclerviewmanyviewtypes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eduana on 20/12/2016.
 */

public class ViewHolderRed extends RecyclerView.ViewHolder {

    private TextView redTextView;

    public ViewHolderRed(View itemView) {
        super(itemView);
        redTextView = (TextView) itemView.findViewById(R.id.redLineTv);
    }

    public TextView getRedTextView() {
        return redTextView;
    }

    public void setRedTextView(TextView redTextView) {
        this.redTextView = redTextView;
    }
}
