using System;
using System.Collections.Generic;
using System.Text;

namespace MonopolyDealGame
{
    class DealBreakerCard:ActionCard
    {
        public DealBreakerCard()
        {
        }

        public override void draw()
        {
            base.draw();
        }
        public override string ToString()
        {
            return base.ToString();
        }
        public override string source()
        {
            throw new NotImplementedException();
        }
        public override void setSource(Deck source)
        {
            base.setSource(source);
        }
        public override void returnToSource()
        {
            base.returnToSource();
        }
    }
}
