using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class DrawPile:Deck
    {
        public DrawPile(Table gameTable, List<Card> cards)
        { 
        }

        public DrawPile(Table gameTable)
        {
        }

        public override string ToString()
        {
            return base.ToString();
        }
        public override String getDeckName() 
        {
            return "Draw Pile";
        }
    }
}
