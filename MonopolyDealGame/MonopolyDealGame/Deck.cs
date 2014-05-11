using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    public abstract class Deck
    {
        private Card card;
        private Player player;
        public void shuffle() 
        { 

        }
        public void drawCard()
        {
        }
        public abstract String getDeckName();
    }
}
