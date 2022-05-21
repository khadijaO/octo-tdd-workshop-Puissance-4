package Puissance4;

public class Grid{
    private final String[][] grille = new String[][]{new String[]{null, null, null, null, null, null},
            new String[]{null, null, null, null, null, null}, new String[]{null, null, null, null, null, null},
            new String[]{null, null, null, null, null, null}, new String[]{null, null, null, null, null, null},
            new String[]{null, null, null, null, null, null}};

    private int columns, rows;
    private boolean empty = true;

    public Grid() {
//this.columns=7;
//this.rows=6;
//for(int i=0;i<this.rows;i++){
//   for(int j=0;i<this.columns;j++){
// this.grille[i][j]=".";
//   }
//      }

    }

    public boolean isEmpty() {
        return empty;
    }

    public void addToken(String jeton, int column) {

        if(column < 0 || column > 6){
            throw new InvalidColomnException();
        }
        empty = false;
        boolean insserted=false;
        String[] columnContent =  getColumn(column);
        for(int i = 0; i< columnContent.length; i++){
            if(columnContent[i]==null){
                columnContent[i] = jeton;
                insserted=true;
                break;
            }


        }
        if(insserted==false)
            throw new IndexOutOfBoundsException();
    }

    public int getColumnsCount() {
        return 7;
    }

    public int getRowsCount() {
        return 6;
    }

    public String[] getColumn(int i) {
        return grille[i];
    }
//   public int getLength(){
//      return this.grille[0].length;
//   }
//
//   public int getRowsLength(){
//      return this.rows;
//   }
//   public int getColumnsLength(){
//      return this.columns;
//   }
//
//public int addJeton(int column){
////return row
//      return 1;
//
//}

}
