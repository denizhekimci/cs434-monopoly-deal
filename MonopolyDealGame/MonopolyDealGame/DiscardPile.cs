using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class DiscardPile:Deck
    {
        public DiscardPile(Table gameTable, List<Card> cards)
        { 
        }

        public DiscardPile(Table gameTable)
        {
        }

        public void draw()
        {

        }
        public override string ToString()
        {
            return base.ToString();
        }
        public override String getDeckName() 
        {
            return "Discard Pile";
        }
    }
}
