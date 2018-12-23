# RecyclerView-Android

The RecyclerView in Android is advanced version of ListView in android. In the RecyclerView several different components work together to display data. We can use LinearLayoutManager or GridLayoutManager on RecyclerView in android. The views in the RecyclerView of a class we define by RecyclerView.ViewHolder.

Step 1. In the starting create an android application from an android studio. Check related post - https://tutorialstack.in/android-first-application/

Step2. Open the build.gradle file for your app module for add support library ”com.android.support:recyclerview-v7:26.1.0”  to the dependencies section.

dependencies 
{
    implementation 'com.android.support:recyclerview-v7:26.1.0'
}

Follow below link to find steps to implement RecyclerView and item click listener of RecyclerView in android

https://tutorialstack.in/implement-list-with-recyclerview-in-android/

https://tutorialstack.in/item-click-listener-on-recyclerview-android/

Summary for declaration of item click listener on recyclerview

1. Define OnItemClickListener mItemClickListener on public level
2. Implements View.OnClickListener on AdapterViewHodel (ItemViewHolder)
3. Add an interface and a function for OnClickListener

  public interface OnItemClickListener {
      public void onItemClick(View view, int position);
  }

  public void setOnItemClicklListener(final OnItemClickListener mItemClickListener) {
      this.mItemClickListener = mItemClickListener;
  }

4. Define onClick on ItemViewHolde and build with the view using below code.
5. call ItemClickListener, set it to on Adapter

  mAdapter.setOnItemClicklListener(new ItemAdapter.OnItemClickListener() {
      @Override
      public void onItemClick(View view, int position) {
          Toast.makeText(context, "Clicked item position: " + position, Toast.LENGTH_SHORT).show();
      }
  });
  
  public ItemViewHolder(View view) {
      super(view);
      view.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
      if (mItemClickListener != null) {
          mItemClickListener.onItemClick(v, getPosition());
      }
  }
