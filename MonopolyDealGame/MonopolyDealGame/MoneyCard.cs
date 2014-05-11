using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class MoneyCard:Card
    {
        public MoneyCard()
        {
        }

        public override void draw()
        {
            throw new NotImplementedException();
        }

        public override String source()
        {
            return "source";
        }
        public override void returnToSource()
        {
            throw new NotImplementedException();
        }
        public override void setSource(Deck source)
        {
            throw new NotImplementedException();
        }
        public override string ToString()
        {
            return base.ToString();
        }

    }
}
